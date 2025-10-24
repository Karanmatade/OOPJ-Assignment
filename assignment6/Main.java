class MyThread extends Thread {
    public void run() 
    {
        System.out.println("Thread is running");
    }
    }

class Myrunnable implements Runnable {
    public void run() 
    {
        System.out.println("Runnable is running");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        Myrunnable r1 = new Myrunnable();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}