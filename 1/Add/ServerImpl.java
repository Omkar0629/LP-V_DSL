import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements ServerIntfc {

    public ServerImpl() throws RemoteException {
    };

    public double add(double num1, double num2) throws RemoteException {
        return num1 + num2;
    }
}
