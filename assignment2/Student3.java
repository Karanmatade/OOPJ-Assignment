import java.util.Scanner;

public class Student3 
{
    int roll;
    String name;
    int age;

    public Student3()
    {
        roll=64;
        name="Karan";
        age=19;
        System.out.println("Roll NO:"+roll+"\nName :"+name+"\nAge :"+age);
    }

    public Student3(int roll, String name , int age)
    {
        this.roll=roll;
        this.name=name;
        this.age=age;
    }
    public Student3(int roll, String name)
    {
        this.roll=roll;
        this.name=name;
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
        Student3 b=new Student3(a,f,g);
        System.out.println("Roll NO:"+a+"\nName :"+f+"\nAge :"+g);
        Student3 c=new Student3(a, f);
        System.out.println("Roll NO:"+a+"\nName :"+f);
        Student3 s1=new Student3();
    }
    
}
