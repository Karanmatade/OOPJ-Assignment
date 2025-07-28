import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1;
        for(int i=2;i<=n/2;i++){
                if(n%i==0) flag = 0;

        }
        if(flag==0) System.out.println("not prime no.");
        else System.out.println(n+"it is a prime number");

    }
    
}
