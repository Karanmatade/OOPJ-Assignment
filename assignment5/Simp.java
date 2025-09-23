interface Animal {
    void makeSound();
    void eat();
}
interface Bird {
    void fly();
}

class Dog implements Animal, Bird {
    public void makeSound() {
        System.out.println("Dog barks");
    }
    
    public void eat() {
        System.out.println("Dog eats bones");	
    }
    
    public void fly() {
        System.out.println("Dog cannot fly!");
    }
}

public class Simp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        System.out.println("Dog behavior:");
        dog.makeSound();
        dog.eat();
        
        // Using interface reference
        System.out.println("\nUsing Animal interface reference:");
        Animal animal = new Dog();
        animal.makeSound();
        animal.eat();
        
        System.out.println("\nUsing Bird interface reference:");
        Bird bird = new Dog();
        bird.fly();
    }
}
