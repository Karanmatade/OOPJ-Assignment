public class recursuion {
    // package RECURSION;

import java.util.Scanner;

public class factorialno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }

     public static int fact(int n) {
        if(n==0 || n==1) return 1;
        int ans = n*fact(n-1);
        return ans ;
      
        
    }
    
}

}
