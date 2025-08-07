import java.util.*;
public class AreaCircle
{
	double r,result;
	public double result()
	{
		result=3.14*r*r;
		return result;
	}

	public static void main(String args[])
	{
		AreaCircle a=new AreaCircle();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Radious");
		a.r=s.nextDouble();
		System.out.println("Area of Circle is:"+a.result());
	}
}