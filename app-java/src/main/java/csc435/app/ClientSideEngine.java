package csc435.app;

import csc435.app.protogen.*;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientSideEngine {
    static private  boolean isConnected;
    private String ip;
    private int port;
    private String clientId;
    private ManagedChannel channel;
    private FileRetrievalGrpc.FileRetrievalBlockingStub stub;
    static Set<String> foldersAccessed = new HashSet<>();


    public boolean getIsConnected(){
        return isConnected;
    }
    public ClientSideEngine(String clientId) {
        this.clientId = clientId;
    }

    public void indexFiles(String rawFile, String datasetNo ) throws Exception {
        File input = new File(rawFile);
        if (input.exists() && input.isDirectory()) {
            File[] files = input.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    if (foldersAccessed.contains(file.getAbsolutePath())) continue;
                    indexFile(file.getAbsolutePath(), file.getName(), datasetNo);
                }
            }
        }

    }

    public void indexFile(String fileName, String name, String datasetNo) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        foldersAccessed.add(datasetNo+name);
        String line;
        HashMap<String, Integer> wordCount = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            line = line.replace("\r", "");
            line = line.replace("\\s+", "");
            line = line.replace("[^\\w\\s", "");
            line = line.replaceAll("[^a-zA-Z0-9 ]", "");
            String[] str = line.split(" ");
            for (String s : str) {
                if(s.equals("")) continue;
                if(wordCount.containsKey(s)){
                    wordCount.put(s, wordCount.get(s) + 1);
                }
                else{
                    wordCount.put(s, 1);
                }
            }
        }
        IndexRequest indexRequest = IndexRequest.newBuilder().setFilename(datasetNo+name).putAllWordCount(wordCount).build();
        IndexReply indexReply = stub.index(indexRequest);
        if(!indexReply.getIndexed()){
            System.out.println("Indexing failed for "+fileName);
        }
    }
    
    public void searchFiles(Set<String> words,int size) {
        String word1 = "",word2="";
        SearchRequest searchRequest = null;
        if(size==1){
            for(String word:words){
                word1 = word;
            }
            searchRequest = SearchRequest.newBuilder().setType(SearchRequest.Type.SINGLE).setWord1(word1).build();
        }
        if(size==2){
            int i = 0;
            for(String word:words){
                if(i==0){
                    word1 = word;
                }
                if(i==1){
                    word2 = word;
                }
                i++;
            }
            searchRequest = SearchRequest.newBuilder().setType(SearchRequest.Type.DOUBLE).setWord1(word1).setWord2(word2).build();
        }
        SearchReply searchReply = stub.search(searchRequest);
        List<String> files = searchReply.getFilesList();
        files.stream().forEach(System.out::println);

    }

    public void openConnection(String ip, String port) {
        channel = Grpc.newChannelBuilder(ip+":"+port, InsecureChannelCredentials.create()).build();
        stub = FileRetrievalGrpc.newBlockingStub(channel);
        stub= stub.withMaxInboundMessageSize(Integer.MAX_VALUE);
        stub= stub.withMaxOutboundMessageSize(Integer.MAX_VALUE);
        ConnectRequest connectRequest = ConnectRequest.newBuilder().setType(ConnectRequest.Type.CONNECT).setClientId(clientId).build();
        isConnected = stub.connect(connectRequest).getConnected();
        if(isConnected){
            System.out.println("connected to gRPC server at "+ip+":"+port);
        }else{
            System.out.println("connection failed");
        }
    }

    public void closeConnection() {
        boolean disconnected = stub.connect(ConnectRequest.newBuilder().setType(ConnectRequest.Type.DISCONNECT).setClientId(clientId).build()).getConnected();
        if(disconnected){
            channel.shutdown();
            isConnected = false;
            System.out.println("connection closed");
        }else{
            System.out.println("disconnection failed");
        }
    }
}
