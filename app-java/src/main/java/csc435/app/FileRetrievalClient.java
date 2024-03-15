package csc435.app;

public class FileRetrievalClient
{
    public static void main(String[] args) throws Exception
    {
        ClientSideEngine engine = new ClientSideEngine(args[0]+":"+args[1]);
        ClientAppInterface appInterface = new ClientAppInterface(engine);
        
        // read commands from the user
        appInterface.readCommands();
    }
}
