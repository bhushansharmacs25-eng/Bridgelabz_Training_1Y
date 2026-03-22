package java_interfaces.MarkerInterfaces;

// Custom Marker Interface
interface BackupSerializable {
}

class UserData implements BackupSerializable {
    String name;
    public UserData(String name) { this.name = name; }
}

class SessionData { // Does not implement BackupSerializable
    String sessionId;
}

public class DataSerialization {
    static void backup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Cannot backup! Object is not marked for serialization: " + obj.getClass().getSimpleName());
        }
    }
    
    public static void main(String[] args) {
        backup(new UserData("Alice"));
        backup(new SessionData());
    }
}
