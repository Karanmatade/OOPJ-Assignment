import java.util.*;
public class Area
{
	double hight,base,result;
	public double result()
	{
		result=0.5*base*hight;
		return result;
	}

	public static void main(String args[])
	{
		Area a=new Area();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Base and Hight");
		a.base=s.nextDouble();
		a.hight=s.nextDouble();
		System.out.println("Area of Triangle is:"+a.result());
	}
}