import java.rmi.*;

public interface ServerIntfc extends Remote{

    double division(double num1, double num2) throws RemoteException;
}