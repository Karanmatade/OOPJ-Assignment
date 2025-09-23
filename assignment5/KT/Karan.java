public class Karan 
{   
    public static void main(String[] args) 
    {

      try {
          String str = "Karan Matade";
          System.out.println(str);
          char c= str.charAt(15);
          System.out.println(c);
      } catch (Exception e) {
          System.out.println("Error: " + e);
      }
      System.out.println("Program continues after handling the exception.");
    }
}