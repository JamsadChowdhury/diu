class Jannat {

    Jannat() {
        System.out.println("Default Constructor");
    }

    Jannat(String name) {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Jannat a = new Jannat();
        Jannat b = new Jannat("Chowdhury");
    }
}
