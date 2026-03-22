package java_interfaces.MarkerInterfaces;

// Custom Marker Interface
interface Sensitive {
}

class UserCredentials implements Sensitive {
    String username;
    String password;
    
    public UserCredentials(String u, String p) {
        this.username = u;
        this.password = p;
    }
}

class PublicProfile {
    String displayName;
    public PublicProfile(String name) { this.displayName = name; }
}

public class SensitiveDataTagging {
    static void processData(Object data) {
        if (data instanceof Sensitive) {
            System.out.println("WARNING: Encrypting sensitive data before processing (" + data.getClass().getSimpleName() + ")");
        } else {
            System.out.println("Processing normal data (" + data.getClass().getSimpleName() + ")");
        }
    }
    
    public static void main(String[] args) {
        processData(new UserCredentials("admin", "secret!123"));
        processData(new PublicProfile("GuestUser"));
    }
}
