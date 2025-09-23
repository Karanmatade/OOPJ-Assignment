interface Student1
{
	public abstract void mark();
}

interface Student2
{
	public abstract void mark();

} 


public class Marks implements Student1,Student2
{
	public void mark()
	{
		int a,b,c;
		c=98;
		System.out.println("Marks is Same :"+c);
	}

	public static void main (String args[])
	{
		Student1 s = new Marks();
		s.mark(); 
	}
}