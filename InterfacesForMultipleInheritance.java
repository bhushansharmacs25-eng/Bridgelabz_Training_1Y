// 10. Use Interfaces for Multiple Inheritance
interface Printer { void print(); }
interface Scanner { void scan(); }
class MultiFunctionMachine implements Printer, Scanner {
    public void print() { System.out.println("Printing"); }
    public void scan() { System.out.println("Scanning"); }
}
public class InterfacesForMultipleInheritance {
    public static void main(String[] args) { new MultiFunctionMachine().print(); }
}
