import mpi.MPI;
import mpi.*;
import java.util.Scanner;

public class ArrMult {
    
    public static void main(String[] args) {
        
        MPI.Init(args);

        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();

        int root = 0;
        int unitsize = 5;

        int send_buffer[] = null;

        int recv_buffer[] = new int[unitsize];
        int new_recv_buffer[] = new int[size];
        send_buffer = new int[unitsize * size];

        if (rank == root) {
            int total_elements = unitsize * size;
            System.out.println("Enter " + total_elements + " elements");
            for(int i=0; i<total_elements; i++){
                send_buffer[i] = i+1;
                System.out.println("Element " + i + " is\t" + (i+1));
            }
        }

        MPI.COMM_WORLD.Scatter(
            send_buffer,
            0,
            unitsize,
            MPI.INT,
            recv_buffer,
            0,
            unitsize,
            MPI.INT,
	root
        );

        for (int i = 1; i < unitsize; i++) {
            recv_buffer[0] *= recv_buffer[i];
        }
        System.out.println("Multiplication at intermediate " + rank + " is " + recv_buffer[0]);

        MPI.COMM_WORLD.Gather(
            recv_buffer,
            0,
            1,
            MPI.INT,
            new_recv_buffer,
            0,
            1,
            MPI.INT,
            root
        );

        if (root == rank) {
            long total_mult = 1;
            for(int i=0;i<size;i++){
                total_mult *= new_recv_buffer[i];
            }
            System.out.println("Final multiplication : " + total_mult);
        }
        MPI.Finalize();
    }
}
