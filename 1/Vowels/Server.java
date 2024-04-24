import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            
            ServerImpl serverImpl = new ServerImpl();
            Naming.rebind("Vowels", serverImpl);
            System.out.println("Server started ... ");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
