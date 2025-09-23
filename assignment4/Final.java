class FinalClassx  
{
    int x = 10;
    void display() {
        System.out.println("Final method:"+x);
    }

    final class Final
    {
        void show() {
            System.out.println("This is a final class.");
        }
    }
    public static void main(String[] args) {
        FinalClassx outer = new FinalClassx();
        FinalClassx.Final obj = outer.new Final();
        obj.show();
    }
       
}
