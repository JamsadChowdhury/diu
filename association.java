public class Maruti {
    public String model;
    public double price;
    public Engine En;            // Reference Variable

    public Maruti(String model, double price, Engine En) {
        System.out.println("Model is: " + model);
        System.out.println("Price is: " + price);
        En.speedUp();
    }

    public static void main(String[] args) {
        Engine e = new Engine(); // Instance of Engine Class
        Maruti m = new Maruti("Maruti", 100000, e);
    }
}

public class Engine {

    public void speedUp() {
        System.out.println("Car is in full speed ");
    }
}
