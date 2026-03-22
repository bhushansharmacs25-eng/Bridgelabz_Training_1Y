// 2. Ensure Proper Use of is-a Relationship
class Vehicle { void move() { System.out.println("Moving"); } }
class ProperCar extends Vehicle { } // ProperCar is a Vehicle
public class ProperIsARelationship {
    public static void main(String[] args) { new ProperCar().move(); }
}
