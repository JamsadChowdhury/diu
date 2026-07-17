class Jam {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {

        Jam obj = new Jam();

        obj.setName("Jamsad");

        System.out.println(obj.getName());
    }
}
