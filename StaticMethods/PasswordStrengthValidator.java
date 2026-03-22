package java_interfaces.StaticMethods;

interface SecurityUtils {
    static boolean checkPasswordStrength(String password) {
        return password != null && password.length() >= 8 && password.matches(".*\\d.*");
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String p1 = "weak";
        String p2 = "StrongPass123";
        
        System.out.println("Is '" + p1 + "' strong? " + SecurityUtils.checkPasswordStrength(p1));
        System.out.println("Is '" + p2 + "' strong? " + SecurityUtils.checkPasswordStrength(p2));
    }
}
