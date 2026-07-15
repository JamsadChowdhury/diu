abstract class Person {
    abstract void work();
}

class Student extends Person {
    void work() {
        System.out.println("Student is studying");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.work();
    }
}
