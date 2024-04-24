import java.rmi.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try {
            
            String URL = "rmi://localhost/LargestString";

            ServerIntfc largIntfc = (ServerIntfc) Naming.lookup(URL);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first string : ");
            String str1 = sc.nextLine();
            System.out.println("Enter second string : ");
            String str2 = sc.nextLine();

            System.out.println("Largest lexicographical string is : " + largIntfc.largest(str1, str2));

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
