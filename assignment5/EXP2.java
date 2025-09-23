public class EXP2
{
    public static void main(String[] args) 
    {
        int a,b,c,d;
        a=10;
        b=0;
        try 
	{
            c = a/b;
	    System.out.println("The result is: " + c);
        }
	 catch (Exception e) 
	{
            System.out.println("Error: Division by zero is not allowed."+e);    
        }
        d=a+b;
        System.out.println("The result is: " + d);
      
    }    
}
