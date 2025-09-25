import java.util.*;

public class Voting
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int age;
	System.out.println("Enter the age :");
	age=sc.nextInt();
	if(age<18)
	{
		System.out.println("You are not Eligible for Voting ");
		throw new ArithmeticException("Age is Less than 18");
	}
	else
	{
		System.out.println("You are Eligible for Voting ");	
	}

	System.out.println("Press 1.xyz 2.pqr 3.abc");

	
}	
}