import java.util.*;

class token_ring{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes: ");
        int n = sc.nextInt();

        int token = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print(" " + i);
        }
        System.out.print(" " + 0);

        try{
            while(true){

                System.out.println("\nEnter Sender : ");
                int s = sc.nextInt();
                System.out.println("Enter Receiver : ");
                int r = sc.nextInt();
                System.out.println("Enter data: ");
                String d = sc.next();

                System.out.println("Token Passing: ");

                for (int i=token; (i%n)!=s; i = (i+1)%n) {
                    System.out.print(" " + i + "->");
                }
                System.out.println(" " + s);

                System.out.println("Sender " + s + " sending data " + d);

                for(int i = (s+1)%n ; i != r; i = (i+1) % n){
                    System.out.println("Data " + d + " forwarded by " + i);
                }
                System.out.println("Data " + d + " received by " + r);

                token = s;

            }
        }catch(Exception e){
            System.out.println("Exception occurred"+e);
        }
    }
}
