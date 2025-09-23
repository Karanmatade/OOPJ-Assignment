class Child1 extends Parent {
    private String childName = "John";
    
    public void displayChild() {
        System.out.println("Child Name: " + childName);
        displayFamily();
    }
    
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.displayChild();
    }
}
