class Color 
{

void display()
{
	String a ="Black";
	System.out.println("Color is :"+a);
}

}

public class Red extends Color
{
	void display()
{
	super.display();
	String b="Red";
	System.out.println("Color is :"+b);
}
public static void main (String args [])
{
	Red r= new Red();
	r.display();
}

}
