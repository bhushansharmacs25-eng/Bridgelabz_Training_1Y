package ScenarioBasedProblems;

class Student {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }
}

class EngineeringStudent extends Student {
    String branch;

    public EngineeringStudent(int rollNo, String name, double marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }

    @Override
    public String calculateGrade() {
        // Appending branch to student name using String methods as req
        String studentWithBranch = name.concat(" (").concat(branch).concat(")");
        return studentWithBranch + " got Grade: " + super.calculateGrade();
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit", 85);
        Student s2 = new EngineeringStudent(102, "Neha", 92, "CS");

        System.out.println("Grade for " + s1.name + ": " + s1.calculateGrade());
        System.out.println(s2.calculateGrade());
    }
}
