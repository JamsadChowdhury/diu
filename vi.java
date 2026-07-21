abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

interface Fuel {

    void refill();
}

class Car extends Vehicle implements Fuel {

    @Override
    void start() {
        System.out.println("Car Started");
    }

    public void refill() {
        System.out.println("Fuel Refilled");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.stop();
        c.refill();
    }
}
