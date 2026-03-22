// 5. Mark Superclass Methods final If Needed
class Security {
    final void authenticate() { System.out.println("Secure Auth"); }
}
class SubSecurity extends Security {
    // void authenticate() {} // Cannot override critical method
}
public class FinalSuperclassMethods {
    public static void main(String[] args) { new SubSecurity().authenticate(); }
}
