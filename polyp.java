class Jannat {

    void show() {
        System.out.println("Parent Class");
    }
}

class Chowdhury extends Jannat {

    void show() {
        System.out.println("Child Class");
    }
}

public class Main {

    public static void main(String[] args) {

        Chowdhury obj = new Chowdhury();

        obj.show();
    }
}
