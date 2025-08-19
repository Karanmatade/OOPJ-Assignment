class RBI
{
    void interestRate()
    {
	int a=7;
        System.out.println("Interest rate is "+a+"%");
    }
}

public class SBI extends RBI
{
    void interestRate()
    {
	int a=8;
        System.out.println("Interest rate is "+a+"%");
    }

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.interestRate();
    }
}
