//Multilevel Inheritance

class Grandparent
{
    String name="Grand";
    int a=1876;
    public void dis()
    {
        System.out.println("Name"+name+"Money"+a);
    }

}
class Parrent extends Grandparent
{
    String namr="Karan";
    int ba=3000000;

    public void dis()
    {
        System.out.println("Name :"+namr+"\nBalance :"+ba);
    }
   
}

public class sub extends Parrent 
{
    public static void main(String[] args) 
    {
        sub c=new sub();
        c.dis();
        System.out.println("Name :"+c.namr);
        System.out.println("Balance :"+c.ba);
        System.out.println("Grand prant name:"+c.name);
    }
    
}
