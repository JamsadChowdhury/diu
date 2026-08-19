class Employee {
    protected String name;
    protected String id;
    protected double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Base Salary for " + name + ": $" + salary);
    }
}

abstract class PermanentEmployee extends Employee {
    protected double bonus;

    public PermanentEmployee(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public abstract void calculateSalary();
}

class FullTimeEmployee extends PermanentEmployee {

    public FullTimeEmployee(String name, String id, double salary, double bonus) {
        super(name, id, salary, bonus);
    }

    @Override
    public void calculateSalary() {
        double totalSalary = salary + bonus;
        System.out.println("[Permanent Employee] " + name + " (ID: " + id + ")");
        System.out.println("Base Salary: $" + salary + " | Bonus: $" + bonus + " | Total Pay: $" + totalSalary);
        System.out.println("--------------------------------------------------");
    }
}

class ContractEmployee extends Employee {
    private int contractPeriod; 

    public ContractEmployee(String name, String id, double salary, int contractPeriod) {
        super(name, id, salary);
        this.contractPeriod = contractPeriod;
    }

    @Override
    public void calculateSalary() {
  
        System.out.println("[Contract Employee] " + name + " (ID: " + id + ")");
        System.out.println("Contract Period: " + contractPeriod + " months | Total Pay: $" + salary);
        System.out.println("--------------------------------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
    
        Employee[] employees = new Employee[2];

  
        employees[0] = new FullTimeEmployee("Rahim", "EMP-101", 50000.0, 10000.0);
        employees[1] = new ContractEmployee("Karim", "EMP-202", 35000.0, 6);

        System.out.println("--- EMPLOYEE SALARY CALCULATIONS ---\n");
      
        for (Employee emp : employees) {
            emp.calculateSalary(); 
        }
    }
}
