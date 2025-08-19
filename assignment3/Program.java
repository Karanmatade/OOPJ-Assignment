import java.util.Scanner;

class Employee1
{
    String g;
    int d;
    public Employee1()
    {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the employy 1 Salary : ");
    d=sc.nextInt();
    System.out.println("Enter the employy 1 Name : ");
    g=sc.next();
    }
    void display1()  
    {
        System.out.println("Salary:"+g+"\nName:"+d);
    }
}

class Employee2 extends Employee1
{
    String b;
    int a;
    public Employee2()
    {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the employy 2 Salary : ");
    a=sc.nextInt();
    System.out.println("Enter the employy 2 Name : ");
    b=sc.next(); 
    }
    
    void display2()  
    {
        System.out.println("Salary:"+a+"\nName:"+b);
    }

}

public class Program extends Employee2 
{
    public static void main(String[] args) 
    {
        Program p= new Program();
        
        p.display1();
        p.display2();
    }   
}
