package java_interfaces.FunctionalInterfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 20;
        Function<String, Integer> lengthChecker = String::length;
        
        String message = "This is a very long message that might exceed limits.";
        int length = lengthChecker.apply(message);
        
        if (length > limit) {
            System.out.println("Message exceeds limit! Length: " + length);
        } else {
            System.out.println("Message accepted.");
        }
    }
}
