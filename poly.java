class Chowdhury {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class Main {

    public static void main(String[] args) {

        Chowdhury obj = new Chowdhury();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
