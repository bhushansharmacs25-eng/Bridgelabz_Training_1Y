// 6. Use @Override Annotation
class Parent { void display() {} }
class Child extends Parent {
    @Override
    void display() { System.out.println("Overridden Safely"); }
}
public class OverrideAnnotation {
    public static void main(String[] args) { new Child().display(); }
}
