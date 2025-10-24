class Myrunnable1 implements Runnable {
    public void run() 
    {
        for(int i=0;i<10;i++) {
            try {
                System.out.println( + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        Myrunnable1 r1 = new Myrunnable1();
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t2.start();
        t3.start();
    }
}