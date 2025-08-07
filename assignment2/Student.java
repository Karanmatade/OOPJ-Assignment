public class Student
{
    int roll;
    String name;
    int age;

    public Student(int r, String n , int a)
    {
        roll=r;
        name=n;
        age=a;
        System.out.println("Roll NO:"+r+"\nName :"+n+"\nAge :"+a);
    }

    public Student(Student b)
    {
        roll= b.roll;
        name= b.name;
        age = b.age;
        System.out.println("Roll NO:"+roll+"\nName :"+name+"\nAge :"+age);
    }
    public static void main(String[] args) 
    {
        Student b=new Student(64,"Karan",18);
        Student d=new Student(b);   
    }
}