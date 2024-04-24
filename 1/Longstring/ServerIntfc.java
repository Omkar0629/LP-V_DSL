import java.rmi.*;

public interface ServerIntfc extends Remote {

    String largest(String s1, String s2) throws RemoteException;
    
}