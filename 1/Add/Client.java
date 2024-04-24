import java.rmi.*;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        try {
            
            String addServerUrl = "rmi://localhost/AddServer";

            ServerIntfc addIntfc = (ServerIntfc) Naming.lookup(addServerUrl);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first number : ");
            double a = sc.nextDouble();
            System.out.println("Enter the second number : ");
            double b = sc.nextDouble();

            System.out.println("First number is : " + a);
            System.out.println("Second number is : " + b);

            System.out.println("-------- Results ----------");

            System.out.println("Sum of " + a + " and " + b + " is " + addIntfc.add(a,b));


        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }

}
