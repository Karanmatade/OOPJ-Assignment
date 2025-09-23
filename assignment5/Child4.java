interface Father
{
	public abstract void money();
}

interface Mother 
{
	public abstract void money();

} 


public class Child4 implements Father,Mother
{
	public void money()
	{
		System.out.println("Father's and Mother's money");
	}

	public static void main (String args[])
	{
		Father c = new Child4();
		c.money(); 
	}
}