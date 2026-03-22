// 9. Prefer Abstract Classes for Partial Implementation
abstract class AbstractShape {
    void moveTo(int x, int y) { System.out.println("Moved to " + x + "," + y); }
    abstract void draw(); // Partial implementation
}
class Circle extends AbstractShape {
    @Override void draw() { System.out.println("Drawing Circle"); }
}
public class AbstractClassPartialImplementation {
    public static void main(String[] args) { new Circle().draw(); }
}
