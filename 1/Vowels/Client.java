import java.rmi.*;
import java.util.*;


public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            String url = "rmi://localhost/Vowels";

            ServerIntfc vowServerIntfc = (ServerIntfc) Naming.lookup(url);

            System.out.println("Enter the string : ");
            
            String s1 = sc.nextLine();

            System.out.println("Vowels in " + s1 + " are " + vowServerIntfc.vowels(s1));

        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
}
