import java.util.*;

public class Bully {

    int max_processes;
    int coordinator;
    boolean processes[];

    public Bully(int max){
        max_processes = max;
        coordinator = max;
        processes = new boolean[max_processes];

        System.out.println("\nCreating processes\n");
        for (int i = 0; i < max; i++) {
            processes[i]=true;
            System.out.println("Process P"+ (i+1) + " is created");
        }
        System.out.println("Process P" + coordinator + " is coordinator\n");
    }

    void displayProcesses(){
        for (int i = 0; i < max_processes; i++) {
            if(processes[i]){
                System.out.println("Process P" + (i+1) + " is up");
            }
            else{
                System.out.println("Process P" + (i+1) + " is down");
            }
        }
        System.out.println("Process P" + coordinator + " is the coordinator");
    }

    void upProcess(int process_id){
        if(!processes[process_id - 1]){
            processes[process_id - 1]=true;
            System.out.println("Process P" + process_id + " is up now\n");
        }
        else{
            System.out.println("Process P" + process_id + " is already up\n");
        }
    }

    void downProcess(int process_id){
        if(!processes[process_id - 1]){
            System.out.println("Process P" + process_id + " is already down\n");
        }
        else{
            processes[process_id - 1] = false;
            System.out.println("Process P" + process_id + " is down now\n");
        }
    }

    void runElection(int process_id){
        coordinator = process_id;
        boolean keepGoing = true;

        for (int i = process_id; i < max_processes && keepGoing; i++) {
            System.out.println("Election message sent by P" + process_id + " to " + (i+1));

            if (processes[i]) {
                keepGoing = false;
                runElection(i+1);
            }
        }
    }
    

    public static void main(String[] args) {
        
        int choice = 0, max_processes = 0;
        Bully bully = null;
        int process_id = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\nBully Algorithm");
            System.out.println("1. Create processes");
            System.out.println("2. Display processes");
            System.out.println("3. Up a process");
            System.out.println("4. Down a process");
            System.out.println("5. Run election algorithm");
            System.out.println("6. Exit Program");
            System.out.print("Enter your choice:- ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter total number of processes: ");
                    max_processes = sc.nextInt();
                    bully = new Bully(max_processes);
                    break;

                case 2:
                    bully.displayProcesses();
                    break;

                case 3:
                    System.out.println("Enter the process id to up the process: ");
                    process_id = sc.nextInt();
                    bully.upProcess(process_id);
                    break;

                case 4:
                    System.out.println("Enter the process id to down the process");
                    process_id = sc.nextInt();
                    bully.downProcess(process_id);
                    break;

                case 5:
                    System.out.println("Enter the process to run the election algorithm: ");
                    process_id = sc.nextInt();
                    bully.runElection(process_id);
                    bully.displayProcesses();
                    break;

                case 6:
                    System.out.println("Exiting system....");
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Wrong choice entered. Please enter correct choice...");
                    break;
            }
        }
    }
} 