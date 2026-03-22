// 16. Test Subclass and Superclass Interactions
class MathBase {
    int add(int a, int b) { return a + b; }
}
class MathSub extends MathBase {
    int addThree(int a, int b, int c) { return add(a, b) + c; } // interacting with superclass state
}
public class TestSubclassInteractions {
    public static void main(String[] args) {
        System.out.println(new MathSub().addThree(1, 2, 3)); // Expected: 6
    }
}
