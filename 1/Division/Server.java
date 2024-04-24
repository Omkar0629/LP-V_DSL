import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            
            ServerImpl divsImpl = new ServerImpl();

            Naming.rebind("Division", divsImpl);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }    
}
