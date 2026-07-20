import java.util.ArrayList;
import java.util.List;

abstract class SmartDevice {

    protected String deviceName;
    protected boolean status;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.status = false;
    }

    public void turnOn(boolean value) {
        status = value;
        System.out.println(deviceName + " is turned ON");
    }

    public void turnOff(boolean value) {
        status = value;
        System.out.println(deviceName + " is turned OFF");
    }
}

class Light extends SmartDevice {

    public String color;

    public Light(String deviceName, String color) {
        super(deviceName);
        this.color = color;
    }

    public void dimLight(int level) {
        System.out.println(deviceName + " dimmed to " + level + "%");
    }

    @Override
    public void turnOn(boolean value) {
        status = value;
        System.out.println("Light " + deviceName + " is ON. Color: " + color);
    }

    @Override
    public void turnOff(boolean value) {
        status = value;
        System.out.println("Light " + deviceName + " is OFF");
    }
}

class ThermoStat extends SmartDevice {

    public double temperature;

    public ThermoStat(String deviceName, double temperature) {
        super(deviceName);
        this.temperature = temperature;
    }

    @Override
    public void turnOn(boolean value) {
        status = value;
        System.out.println("Thermostat " + deviceName +
                " is ON at " + temperature + "°C");
    }

    @Override
    public void turnOff(boolean value) {
        status = value;
        System.out.println("Thermostat " + deviceName + " is OFF");
    }
}

class SmartHome {

    private List<SmartDevice> devices;

    public SmartHome() {
        devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnOnAllDevices() {
        for (SmartDevice device : devices) {
            device.turnOn(true);
        }
    }

    public void turnOffAllDevices() {
        for (SmartDevice device : devices) {
            device.turnOff(false);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Light light1 = new Light("Living Room Light", "White");
        ThermoStat thermo1 = new ThermoStat("Bedroom Thermostat", 24.5);

        SmartHome home = new SmartHome();

        home.addDevice(light1);
        home.addDevice(thermo1);

        light1.dimLight(50);

        home.turnOnAllDevices();

        home.turnOffAllDevices();
    }
}
