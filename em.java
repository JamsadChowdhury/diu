abstract class Employee {

    abstract void work();

    void office() {
        System.out.println("Employee enters office.");
    }
}

interface Salary {

    void paySalary();
}

class Manager extends Employee implements Salary {

    @Override
    void work() {
        System.out.println("Manager manages employees.");
    }

    public void paySalary() {
        System.out.println("Salary Paid.");
    }
}

public class Main {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.office();
        m.work();
        m.paySalary();
    }
}
