class Parent {
    protected String familyName = "Matade";
    
    public void displayFamily() {
        System.out.println("Surname: " + familyName);
    }
}

class Child1 extends Parent {
    private String childName = "Karan";
    
    public void displayChild1() {
        System.out.println("First Child Name: " + childName);
        displayFamily();
    }
}

class Child2 extends Parent {
    private String childName = "Samruddhi";
    
    public void displayChild2() {
        System.out.println("Second Child Name: " + childName);
        displayFamily();
    }
}

public class Hf {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        
        System.out.println("Details of First Child:");
        c1.displayChild1();
        
        System.out.println("\nDetails of Second Child:");
        c2.displayChild2();
    }
}
