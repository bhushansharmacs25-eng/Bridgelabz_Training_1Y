package java_interfaces.DefaultMethods;

interface VehicleDashboard {
    void displaySpeed(int speed);
    
    default void displayBattery(int percentage) {
        System.out.println("Battery display not supported on this vehicle.");
    }
}

class GasCar implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("Gas Car Speed: " + speed + " mph");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("EV Speed: " + speed + " mph");
    }
    
    @Override
    public void displayBattery(int percentage) {
        System.out.println("EV Battery Level: " + percentage + "%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard gasCar = new GasCar();
        gasCar.displaySpeed(60);
        gasCar.displayBattery(0); // Optional default call
        
        VehicleDashboard ev = new ElectricCar();
        ev.displaySpeed(75);
        ev.displayBattery(85);
    }
}
