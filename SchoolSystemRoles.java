package Inheritance_Problems;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println(name + " is a Person in the school.");
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Teacher for " + subject + ".");
    }
}

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Student in Grade: " + grade + ".");
    }
}

class Staff extends Person {
    String roleName;

    public Staff(String name, int age, String roleName) {
        super(name, age);
        this.roleName = roleName;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Staff member working as: " + roleName + ".");
    }
}

public class SchoolSystemRoles {
    public static void main(String[] args) {
        Person p1 = new Teacher("Mr. Smith", 40, "Math");
        Person p2 = new Student("Alice", 15, "10th");
        Person p3 = new Staff("Bob", 50, "Librarian");
        
        p1.displayRole();
        p2.displayRole();
        p3.displayRole();
    }
}
