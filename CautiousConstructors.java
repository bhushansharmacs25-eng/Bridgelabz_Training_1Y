// 13. Be Cautious with Constructors
class BaseClass {
    BaseClass() { System.out.println("Base constructor called"); }
}
class SubClass extends BaseClass {
    SubClass() {
        super(); // explicit call
        System.out.println("Sub constructor called safely");
    }
}
public class CautiousConstructors {
    public static void main(String[] args) { new SubClass(); }
}
