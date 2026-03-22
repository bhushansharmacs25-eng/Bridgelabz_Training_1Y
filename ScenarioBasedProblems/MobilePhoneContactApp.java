package ScenarioBasedProblems;

class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + name + " | Phone: " + phoneNumber);
    }
}

class BusinessContact extends Contact {
    String companyName;

    public BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    @Override
    public void display() {
        System.out.println(String.format("Name: %s | Phone: %s | Company: %s", 
                name.toUpperCase(), phoneNumber, companyName));
    }
}

public class MobilePhoneContactApp {
    public static void main(String[] args) {
        Contact c1 = new Contact("John Doe", "1234567890");
        Contact c2 = new BusinessContact("Jane Smith", "0987654321", "Tech Corp");

        c1.display();
        c2.display();
    }
}
