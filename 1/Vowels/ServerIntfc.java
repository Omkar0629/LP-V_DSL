import java.rmi.*;

public interface ServerIntfc extends Remote{

    int vowels(String s) throws RemoteException;
    
}