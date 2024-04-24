import mpi.*;

import mpi.MPI;

import java.util.Scanner;


public class ArrSum {

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

        if(root == rank){
            int total_elements = unitsize * size;
            System.out.println("Enter " + total_elements + " elements");
            for(int i=0; i<total_elements; i++){
                send_buffer[i] = i;
                System.out.println("Element " + i + "is\t" + i);
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
            recv_buffer[0] += recv_buffer[i];
        }
        System.out.println("Sum at intermediate process " + rank + " is " + recv_buffer[0]);

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


        if(rank == root){
            int total_sum = 0;
            for (int j = 0; j < size; j++) {
                total_sum += new_recv_buffer[j];
            }
            System.out.println("Final sum : " + total_sum);
        }

        MPI.Finalize();
        
    }
}
