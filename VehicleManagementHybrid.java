package Inheritance_Problems;

interface Refuelable {
    void refuel();
}

class VehicleHybrid {
    int maxSpeed;
    String model;

    public VehicleHybrid(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class PetrolVehicle extends VehicleHybrid implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Petrol Vehicle: " + model);
    }
}

class ElectricVehicle extends VehicleHybrid {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging Electric Vehicle: " + model);
    }
}

public class VehicleManagementHybrid {
    public static void main(String[] args) {
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic");
        ElectricVehicle ev = new ElectricVehicle(200, "Tesla Model 3");

        System.out.println(pv.model + " max speed: " + pv.maxSpeed);
        pv.refuel();

        System.out.println(ev.model + " max speed: " + ev.maxSpeed);
        ev.charge();
    }
}
