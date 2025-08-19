
class Parrent
{
    String namr="Karan";
    int ba=3000000;

    public void dis()
    {
        System.out.println("Name :"+namr+"\nBalance :"+ba);
    }
   
}

public class child extends Parrent 
{
    public static void main(String[] args) 
    {
        child c=new child();
        c.dis();
        System.out.println("Name :"+c.namr);
        System.out.println("Balance :"+c.ba);
    }
    
}
