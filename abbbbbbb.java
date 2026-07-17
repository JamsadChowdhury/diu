abstract class Jamsad {

    abstract void show();

    void display() {
        System.out.println("Abstract Class");
    }
}

class Mahin extends Jamsad {

    void show() {
        System.out.println("Abstract Method");
    }
}

public class Main {
    public static void main(String[] args) {

        Mahin obj = new Mahin();

        obj.display();
        obj.show();
    }
}
