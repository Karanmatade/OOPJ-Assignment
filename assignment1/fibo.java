   package assignment1;
   import java.util.Scanner;

    public class fibo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = 0 ,  b = 1;
            System.out.println("Enter terms ");
            int n = sc.nextInt();
            if(n<=0) System.out.println("enter valid");
            
        }
        public int fibo(int n) {
            if(n<=1) return n;
            return fibo(n-1) + nthFibonacci(n-2);

        }
    }





    class Solution {
        public int nthFibonacci(int n) {
            if(n<=1) return n;
            return nthFibonacci(n-1) + nthFibonacci(n-2);
        }
    }
