import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping a and b is"+a +" "+b);

        int temp = a;
        a = b ;
        b = temp;

        System.out.println("after swapping a and b is"+a+b);
    }
}
