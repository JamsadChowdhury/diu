abstract class Bank {
    abstract void interest();
}

class CityBank extends Bank {
    void interest() {
        System.out.println("Interest Rate: 8%");
    }
}

public class Main {
    public static void main(String[] args) {
        CityBank b = new CityBank();
        b.interest();
    }
}
