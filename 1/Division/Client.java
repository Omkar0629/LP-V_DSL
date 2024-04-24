import java.rmi.*;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        try {

            String divServerUrl = "rmi://localhost/Division";

            ServerIntfc divServerIntfc = (ServerIntfc) Naming.lookup(divServerUrl);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number : ");
            double a = sc.nextDouble();
            double b = 0;
            while (b == 0) {
                System.out.println("Enter second number : ");
                b = sc.nextDouble();
            }

            System.out.println("First number is " + a);
            System.out.println("Second number is " + b);

            System.out.println("Division of two numbers is : " + divServerIntfc.division(a, b));
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
