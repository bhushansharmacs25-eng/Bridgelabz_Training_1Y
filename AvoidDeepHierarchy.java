// 4. Avoid Deep Inheritance Hierarchies
class Animal { void eat() {} }
class Dog extends Animal { void bark() {} }
// Stop here instead of deep subclassing like SmallDog -> Poodle -> TeacupPoodle
public class AvoidDeepHierarchy {
    public static void main(String[] args) { new Dog().eat(); }
}
