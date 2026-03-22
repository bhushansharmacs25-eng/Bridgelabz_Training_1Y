package Inheritance_Problems;

class Course {
    String courseName;
    int durationHours;

    public Course(String courseName, int durationHours) {
        this.courseName = courseName;
        this.durationHours = durationHours;
    }
    
    public void display() {
        System.out.println("Course: " + courseName + " | Duration: " + durationHours + " hrs");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int durationHours, String platform, boolean isRecorded) {
        super(courseName, durationHours);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Platform: " + platform + " | Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int durationHours, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, durationHours, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Fee: $" + fee + " | Discount: $" + discount + " | Net: $" + (fee - discount));
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Advanced Java", 40, "Udemy", true, 99.99, 20.0);
        course.display();
    }
}
