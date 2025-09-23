public class StringTest 
{   
    public static void main(String[] args) 
    {
        String str = null;
        try 
    {
            System.out.println(str.length());
        } 
    catch (Exception e) 
    {
            System.out.println("Error: Null reference encountered."+e);
        }
        System.out.println("Program continues after handling the exception.");
    }
    
    
}
