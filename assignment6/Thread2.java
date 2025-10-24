import java.util.Scanner;

class NameThread extends Thread {
    private String userName;
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void run() {
        try {
            // Simulate some processing time
            Thread.sleep(1000);
            System.out.println("Processing name in thread: " + Thread.currentThread().getName());
            System.out.println("Hello " + userName + "! Welcome to the program.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class InputThread extends Thread {
    private NameThread nameThread;
    
    public InputThread(NameThread nameThread) {
        this.nameThread = nameThread;
    }
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        nameThread.setUserName(name);
        scanner.close();
    }
}

public class Thread2 {
    public static void main(String[] args) {
        NameThread nameThread = new NameThread();
        InputThread inputThread = new InputThread(nameThread);
        
        System.out.println("Starting threads...");
        inputThread.start();  // Start input thread
        
        try {
            inputThread.join();  // Wait for input thread to complete
            nameThread.start();  // Start name processing thread
            nameThread.join();   // Wait for name thread to complete
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("All threads completed.");
    }
}
