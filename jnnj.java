abstract class Jam {

    abstract void show();

    void display() {
        System.out.println("Welcome to OOP");
    }
}

interface Nur {

    void message();
}

class Jamsad extends Jam implements Nur {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    void show() {
        System.out.println("Student Name: " + getName());
    }

    public void message() {
        System.out.println("Learning Multiple Inheritance");
    }
}

public class Main {

    public static void main(String[] args) {

        Jamsad niha = new Jamsad();

        niha.setName("Jannat");

        niha.display();
        niha.show();
        niha.message();
    }
}
