import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntfc{

    public ServerImpl() throws RemoteException{}
    
    public String largest(String s1, String s2) throws RemoteException{

        if(s1.compareTo(s2)>=0){
            return s1;
        }
        else{
            return s2;
        }
    }
}
