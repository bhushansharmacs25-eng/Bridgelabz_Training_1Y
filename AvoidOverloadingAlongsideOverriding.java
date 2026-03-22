// 8. Avoid Overloading Alongside Overriding
class ParentTask {
    void process() { System.out.println("Process Parent"); }
}
class ChildTask extends ParentTask {
    @Override
    void process() { System.out.println("Process Child"); }
    // Avoid: void process(int data) {} // confusing overload
    void processSpecific(int data) { System.out.println("Process specific: " + data); }
}
public class AvoidOverloadingAlongsideOverriding {
    public static void main(String[] args) { new ChildTask().process(); }
}
