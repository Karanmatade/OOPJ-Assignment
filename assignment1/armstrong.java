package assignment1;
public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int a = 0;
        int temp = n ;
        while(temp!=0){
            int digit = temp%10;
            a += Math.pow(digit,3);
            temp /= 10;
        }
        System.out.println(n==temp);
    }
}
