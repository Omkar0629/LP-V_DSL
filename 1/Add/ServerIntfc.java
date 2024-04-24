import java.rmi.*;

public interface ServerIntfc extends Remote{

    double add(double num1,double num2) throws RemoteException;
    
}