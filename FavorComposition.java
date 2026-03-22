// 1. Favor Composition Over Inheritance
class Engine { void start() { System.out.println("Engine started"); } }
class CompositionCar {
    private Engine engine = new Engine(); // "has-a" instead of "is-a"
    void startCar() { engine.start(); }
}
public class FavorComposition {
    public static void main(String[] args) { new CompositionCar().startCar(); }
}
