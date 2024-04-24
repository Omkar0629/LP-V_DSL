import java.io.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import ReverseModule.*;

public class ReverseClient {
    
    public static void main(String[] args) {
        
        Reverse ReverseImpl = null;
        try {
            
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "Reverse";

            ReverseImpl = ReverseHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Enter string : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str  = br.readLine();

            System.out.println(ReverseImpl.capital(str));

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
