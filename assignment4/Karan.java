class Annasaheb
{
    public void dis()
    {
        System.out.println("Name :Annasaheb");
    }
   
}

public class Karan extends Annasaheb
{
    public void dis()
    {
        super.dis();
        System.out.println("Name :Karan");
    }
    public static void main(String[] args) 
    {
        Karan c=new Karan();
        c.dis();
    }
    
}
