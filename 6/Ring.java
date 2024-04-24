import java.util.*;

public class Ring {

    int max_processes;
    int coordinator;
    boolean processes[];
    ArrayList<Integer> pid;

    public Ring(int max) {
        max_processes = max;
        coordinator = max;
        processes = new boolean[max_processes];
        pid = new ArrayList<Integer>();

        System.out.println("\nCreating processes\n");
        for (int i = 0; i < max; i++) {
            processes[i] = true;
            System.out.println("Process P" + (i + 1) + " is created");
        }
        System.out.println("Process P" + coordinator + " is coordinator\n");
    }

    void displayProcesses() {
        for (int i = 0; i < max_processes; i++) {
            if (processes[i]) {
                System.out.println("Process P" + (i + 1) + " is up");
            } else {
                System.out.println("Process P" + (i + 1) + " is down");
            }
        }
        System.out.println("Process P" + coordinator + " is the coordinator");
    }

    void upProcess(int process_id) {
        if (!processes[process_id - 1]) {
            processes[process_id - 1] = true;
            System.out.println("Process P" + process_id + " is up now\n");
        } else {
            System.out.println("Process P" + process_id + " is already up\n");
        }
    }

    void downProcess(int process_id) {
        if (!processes[process_id - 1]) {
            System.out.println("Process P" + process_id + " is already down\n");
        } else {
            processes[process_id - 1] = false;
            System.out.println("Process P" + process_id + " is down now\n");
        }
    }

    void displayArrayList(ArrayList<Integer> pid) {
        System.out.print("[ ");
        for (Integer x : pid) {
            System.out.print(x + " ");
        }
        System.out.print(" ]\n");
    }

    void runElection(int process_id) {
        if (processes[process_id - 1]) {
            pid.add(process_id);

            System.out.println("Process P" + process_id + " sending following list ");
            displayArrayList(pid);

            int temp = process_id;

            while (temp != process_id - 1) {
                if (processes[temp]) {
                    pid.add(temp + 1);
                    System.out.println("Process P" + (temp + 1) + " sending following list ");
                    displayArrayList(pid);
                }
                temp = (temp + 1) % max_processes;
            }
            coordinator = Collections.max(pid);
            System.out.println("Process P" + process_id + " announces " + coordinator + " as coordinator");
            pid.clear();
        }
        else {
            System.out.println("Selected process id is down please select other process id...");
        }
    }


    public static void main(String[] args) {
        Ring ring = null;
        int max_processes = 0, process_id = 0;
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ring Algorithm");
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
                    System.out.print("Enter the total number of processes:- ");
                    max_processes = sc.nextInt();
                    ring = new Ring(max_processes);
                    break;
                case 2:
                    ring.displayProcesses();
                    break;
                case 3:
                    System.out.print("Enter the process to up:- ");
                    process_id = sc.nextInt();
                    ring.upProcess(process_id);
                    break;
                case 4:
                    System.out.print("Enter the process to down:- ");
                    process_id = sc.nextInt();
                    ring.downProcess(process_id);
                    break;
                case 5:
                    System.out.print("Enter the process which will initiate election:- ");
                    process_id = sc.nextInt();
                    ring.runElection(process_id);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error in choice. Please try again.");
                    break;
            }
        }
    }
}
