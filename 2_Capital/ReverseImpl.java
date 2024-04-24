import ReverseModule.*;/**
 * ReverseImpl
 */
public class ReverseImpl extends ReversePOA{

    ReverseImpl(){
        super();

        System.out.println("Object Created");
    }

    public String capital(String str){
        return (("Server send : " + str.toUpperCase()));
    }
}