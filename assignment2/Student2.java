import java.util.Scanner;

public class Student2 
{
    int roll;
    String name;
    int age;

    public Student2(int roll, String name , int age)
    {
        this.roll=roll;
        this.name=name;
        this.age=age;
    }

    public void display()
    {
        System.out.println("Roll NO:"+roll+"\nName :"+name+"\nAge :"+age);
    }
     public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int a,g;
        String f;
        System.out.println("Enter the Roll No:");
        a=s.nextInt();
        System.out.println("Enter the Name:");
        f=s.next();
        System.out.println("Enter the age:");
        g=s.nextInt();
        Student2 b=new Student2(a,f,g);
        b.display();
    }
    
}
