import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerImpl compServerImpl = new ServerImpl();

            Naming.rebind("LargestString", compServerImpl);
            
            System.out.println("Server started");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    

}
