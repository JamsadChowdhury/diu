abstract class Student {

    abstract void study();

    void attendClass() {
        System.out.println("Student attends class.");
    }
}

interface Exam {

    void exam();
}

class CSE extends Student implements Exam {

    @Override
    void study() {
        System.out.println("Student studies Java.");
    }

    public void exam() {
        System.out.println("Student attends exam.");
    }
}

public class Main {

    public static void main(String[] args) {

        CSE s = new CSE();

        s.attendClass();
        s.study();
        s.exam();
    }
}
