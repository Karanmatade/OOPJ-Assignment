/*  create a class Bank account As a abstract class From that abstract class Derive a child class  Saving account & Current account
 there are following four methods
 1) Give details
 2) Deposit 
 3) Withdrawal
 4) Check Balance   */
import java.util.Scanner;
abstract class BankAccount 
{  
    protected String name;
    protected double balance;

    public BankAccount() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        this.name = sc.next();
        System.out.print("Enter initial balance: ");
        this.balance = sc.nextDouble();
    }

    abstract void GiveDetails();
    abstract void deposit(double amount);
    abstract void withdrawal(double amount);
    abstract double checkBalance();
}

public class SampleAB extends BankAccount
{
    void GiveDetails() 
    {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Balance: " + balance);
    }

    void deposit(double amount) 
    {
        balance=balance+amount;
        System.out.println("Deposited: " + amount);
    }

    void withdrawal(double amount)
    {
        balance =balance-amount;
        System.out.println("Withdrawn: " + amount);
    }

    double checkBalance()
    {
        return balance;
    }
    
    public static void main(String[] args) 
{
	
        SampleAB a = new SampleAB();
        a.GiveDetails();
        a.deposit(5000);
        a.withdrawal(2000);
        System.out.println("Current Balance: " + a.checkBalance());
    }
}
