package csc435.app;

import csc435.app.protogen.*;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ServerSideEngine {
    private io.grpc.Server server;
    private static IndexStore store;

    public ServerSideEngine(IndexStore store) {
        this.store = store;

    }

    public void initialize(String address, Integer port) {
        ServerBuilder<?> serverBuilder = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create());
        server = serverBuilder
                .addService(new FileRetrievalService(store))
                .maxInboundMessageSize(Integer.MAX_VALUE)
                .build();

        try {
            server.start();
        } catch (Exception e) {
            return;
        }
    }

    public void shutdown() {
        try{
            server.shutdown();
            server.awaitTermination();
        } catch (InterruptedException e) {
            return;
        }
    }

    public void list() {
        for(String s: GlobalIndex.connectedClients){
            System.out.println(s);
        }
    }

    private static class FileRetrievalService extends FileRetrievalGrpc.FileRetrievalImplBase {
        private IndexStore store;
        FileRetrievalService(IndexStore store) {
            this.store = store;
        }

        @Override
        public void connect(ConnectRequest request, StreamObserver<ConnectReply> respObserver) {
            respObserver.onNext(doConnect(request));
            respObserver.onCompleted();
        }
        
        @Override
        public void index(IndexRequest request, StreamObserver<IndexReply> respObserver) {
            respObserver.onNext(doIndex(request));
            respObserver.onCompleted();
        }

        @Override
        public void search(SearchRequest request, StreamObserver<SearchReply> respObserver) {
            respObserver.onNext(doSearch(request));
            respObserver.onCompleted();
        }

        private ConnectReply doConnect(ConnectRequest request) {
            if(request.getType().equals(ConnectRequest.Type.CONNECT)){
                GlobalIndex.connectedClients.add(request.getClientId());
                return ConnectReply.newBuilder().setConnected(true).build();
            }
            GlobalIndex.connectedClients.remove(request.getClientId());
            return ConnectReply.newBuilder().setConnected(true).build();


        }

        private IndexReply doIndex(IndexRequest request) {
            GlobalIndex.globalIndex.put(request.getFilename(), request.getWordCountMap());
            return IndexReply.newBuilder().setIndexed(true).build();
        }

        private SearchReply doSearch(SearchRequest request) {
            if(request.getType().equals(SearchRequest.Type.SINGLE)){
                String word = request.getWord1();
                return SearchReply.newBuilder().addAllFiles(store.lookupIndex(word)).build();
            }
            String word1 = request.getWord1();
            String word2 = request.getWord2();
            return SearchReply.newBuilder().addAllFiles(store.lookupIndex(word1,word2)).build();
        }
    }
}
