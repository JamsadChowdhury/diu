class University {

    String name;
    String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println("University Name: " + name +
                "\tLocation: " + location);
    }
}

class Canteen {

    String canteenName;
    int no_ofFoodItem;
    int no_ofTables;

    public Canteen(String canteenName, int no_ofFoodItem, int no_ofTables) {
        this.canteenName = canteenName;
        this.no_ofFoodItem = no_ofFoodItem;
        this.no_ofTables = no_ofTables;
    }

    public void display() {
        System.out.println("Canteen Name: " + canteenName +
                "\tNo of Food Items: " + no_ofFoodItem +
                "\tNo of Tables: " + no_ofTables);
    }
}

class Diu extends University {

    String faculty;
    String dept;
    int no_ofStudents;
    Canteen can;

    public Diu(String faculty, String dept, int no_ofStudents,
               Canteen can, String name, String location) {

        super(name, location);
        this.faculty = faculty;
        this.dept = dept;
        this.no_ofStudents = no_ofStudents;
        this.can = can;
    }

    public void display() {
        super.display();
        System.out.println("Faculty of: " + faculty +
                "\tDepartment of: " + dept +
                "\tNo of Students: " + no_ofStudents);
    }
}

public class Main {

    public static void main(String[] args) {

        Canteen c = new Canteen("Sugondha", 10, 8);
        Diu d = new Diu("FSIT", "CSE", 10000, c, "DIU", "Dhaka");

        d.display();
        c.display();
    }
}
