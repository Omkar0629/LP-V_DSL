import java.rmi.*;
import java.rmi.server.*;


public class ServerImpl extends UnicastRemoteObject implements ServerIntfc{
    
    public ServerImpl() throws RemoteException{}

    public int vowels(String s) throws RemoteException{
        int count =0;

        for(int i=0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}
