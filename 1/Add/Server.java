import java.rmi.*;

public class Server {
    
    public static void main(String[] args) {
        try {
            
            ServerImpl addServerImpl = new ServerImpl();

            Naming.rebind("AddServer", addServerImpl);

            System.out.println("Server started...");

        } catch (Exception e) {
            System.out.println("Exception occurred " + e);
        }   
    }
}
