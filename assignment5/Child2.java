interface Father
{
	public abstract void add();
}

interface Mother 
{
	public abstract void add();

} 


public class Child2 implements Father,Mother
{
	public void add()
	{
		int a,b,c;
		a=10;
		b=30;
		c=a+b;
		System.out.println("Addition is :"+c);
	}

	public static void main (String args[])
	{
		Father c = new Child2();
		c.add(); 
	}
}