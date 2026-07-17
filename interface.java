interface Jam {
    void show();
}

interface Nur {
    void display();
}

class Jamsad implements Jam, Nur {

    public void show() {
        System.out.println("Interface Jam");
    }

    public void display() {
        System.out.println("Interface Nur");
    }
}

public class Main {

    public static void main(String[] args) {

        Jamsad obj = new Jamsad();

        obj.show();
        obj.display();
    }
}
