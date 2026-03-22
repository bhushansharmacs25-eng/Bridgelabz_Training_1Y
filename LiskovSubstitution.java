// 3. Follow Liskov Substitution Principle
class Bird { void move() { System.out.println("Moving"); } }
class FlyingBird extends Bird { void move() { System.out.println("Flying"); } }
class Ostrich extends Bird { void move() { System.out.println("Walking"); } }
public class LiskovSubstitution {
    public static void main(String[] args) {
        Bird b = new Ostrich(); b.move(); // Substitutable without breaking
    }
}
