// 14. Use Polymorphism Effectively
class PolyShape { void draw() {} }
class Square extends PolyShape { @Override void draw() { System.out.println("Square"); } }
class Triangle extends PolyShape { @Override void draw() { System.out.println("Triangle"); } }
public class PolymorphismEffectively {
    public static void main(String[] args) {
        PolyShape[] shapes = { new Square(), new Triangle() };
        for (PolyShape s : shapes) s.draw();
    }
}
