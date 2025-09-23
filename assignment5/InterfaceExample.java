interface Academic {
    void study();
    void submitAssignment();
}

interface Sports {
    void play();
    void practice();
}

// Class implementing multiple interfaces
class Student implements Academic, Sports {
    private String name;
    private int rollNo;
    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    // Implementing Academic interface methods
    public void study() {
        System.out.println(name + " (Roll No: " + rollNo + ") is studying for exams");
    }
    
    public void submitAssignment() {
        System.out.println(name + " submitted the assignment");
    }
    
    // Implementing Sports interface methods
    public void play() {
        System.out.println(name + " is playing cricket");
    }
    
    public void practice() {
        System.out.println(name + " is practicing in the ground");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Student student = new Student("Karan", 101);
        
        // Using Academic interface methods
        System.out.println("Academic Activities:");
        student.study();
        student.submitAssignment();
        
        // Using Sports interface methods
        System.out.println("\nSports Activities:");
        student.play();
        student.practice();
        
        // Using interface references
        System.out.println("\nUsing Interface References:");
        Academic academicRef = student;
        Sports sportsRef = student;
        
        academicRef.study();
        sportsRef.play();
    }
}
