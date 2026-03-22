package ScenarioBasedProblems;

class Employee {
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}

class Manager extends Employee {
    String department;

    public Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }

    @Override
    public String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Alice");
        Employee mgr = new Manager(2, "Bob", "IT");

        System.out.println("Employee Email: " + emp.generateEmail());
        System.out.println("Manager Email: " + mgr.generateEmail());
    }
}
