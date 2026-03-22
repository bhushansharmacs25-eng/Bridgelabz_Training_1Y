// 12. Avoid Overriding Methods Unnecessarily
class BaseProcess {
    void execute() { System.out.println("Executing base logic"); }
}
class StandardProcess extends BaseProcess {
    // Reuses execute() without unnecessary overriding
}
public class AvoidUnnecessaryOverriding {
    public static void main(String[] args) { new StandardProcess().execute(); }
}
