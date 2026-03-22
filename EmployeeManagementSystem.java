package Inheritance_Problems;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int durationMonths;
    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration (Months): " + durationMonths);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee m1 = new Manager("Alice", 101, 80000, 5);
        Employee d1 = new Developer("Bob", 102, 60000, "Java");
        Employee i1 = new Intern("Charlie", 103, 15000, 6);

        m1.displayDetails();
        d1.displayDetails();
        i1.displayDetails();
    }
}
