// 18. Consider Using Delegation for Special Cases
class PrinterLogic { void print() { System.out.println("Printing document"); } }
class AppService {
    private PrinterLogic printer = new PrinterLogic(); // delegation
    void triggerPrint() { printer.print(); }
}
public class DelegationForSpecialCases {
    public static void main(String[] args) { new AppService().triggerPrint(); }
}
