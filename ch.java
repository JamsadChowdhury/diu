class Chowdhury {

    int id;

    Chowdhury(int id) {
        this.id = id;
    }

    void show() {
        System.out.println("ID: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        Chowdhury obj = new Chowdhury(101);
        obj.show();
    }
}
