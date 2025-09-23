class Employee
{
	public Employee(int a)
	{
		System.out.println("Employee Salary is "+a);
	}
}

public class Manager extends Employee
{
	public Manager()
	{
		super(10000);
		System.out.println("Manager salary is 20000");
	}

	public static void main(String args[])
	{
		Manager m = new Manager ();
	}


}