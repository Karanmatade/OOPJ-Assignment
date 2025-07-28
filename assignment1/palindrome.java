public class palindrome {
    public static void main(String[] args) {
        
    
    String str = "racecar";
    String rev = new StringBuilder(str).reverse().toString();
   if(str==rev) System.out.println("palindrome");
    else System.out.println("not");
}
}
