package Inheritance_Problems;

class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Fuel Type: " + fuelType + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class Car extends Vehicle {
    int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double payloadCapacity;
    public Truck(int maxSpeed, String fuelType, double payloadCapacity) {
        super(maxSpeed, fuelType);
        this.payloadCapacity = payloadCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Car(200, "Petrol", 5),
            new Truck(100, "Diesel", 10.5),
            new Motorcycle(150, "Petrol", false)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("---");
        }
    }
}
