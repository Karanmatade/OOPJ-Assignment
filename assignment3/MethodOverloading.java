public class MethodOverloading 
{ 
    public void add()
    {
        int a,b;
        a = 10;
        b = 10;
        System.out.println("Sum of two integers: " + add(a, b));
    }
    public int add(int a, int b) 
    {
        return a + b;
    }

    public int add(int a, int b, int c) 
    {                       
        return a + b + c;
    }
    public double add(double a, double b) 
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        MethodOverloading mo = new MethodOverloading();
        mo.add();
        System.out.println("Sum of two integers: " + mo.add(5, 10));
        System.out.println("Sum of three integers: " + mo.add(5, 10, 15));
        System.out.println("Sum of two double values: " + mo.add(5.5, 10.5));
    }
}
