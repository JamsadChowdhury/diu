class Jamsad {

    String name;

    Jamsad(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Jamsad obj = new Jamsad("Jamsad");
        obj.display();
    }
}
