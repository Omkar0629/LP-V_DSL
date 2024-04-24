import ReverseModule.ReversePOA;

import java.lang.String;

/**
 * ReverseImpl
 */
public class ReverseImpl extends ReversePOA{

    ReverseImpl(){
        super();

        System.out.println("Reverse object created");
    }

    public String reverse_string(String name){
        
        StringBuffer str = new StringBuffer(name);
        str.reverse();
        return (("Server sent : " + str));
    }
}