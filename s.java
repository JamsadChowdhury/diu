abstract class Jannat {
    abstract void display();
}

class Chowdhury extends Jannat {
    void display() {
        System.out.println("Hello Jannat Chowdhury");
    }
}

public class Main {
    public static void main(String[] args) {
        Chowdhury obj = new Chowdhury();
        obj.display();
    }
}
