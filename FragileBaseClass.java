// 15. Beware of Fragile Base Class Problem
// Keeping base classes strictly localized to prevent widespread breaking changes
class CoreLogic {
    protected void performDefaultTask() { System.out.println("Core task"); }
}
class CustomLogic extends CoreLogic {
    void doTask() { performDefaultTask(); }
}
public class FragileBaseClass {
    public static void main(String[] args) { new CustomLogic().doTask(); }
}
