package ScenarioBasedProblems;

class Course {
    int courseId;
    String courseName;
    double price;
    static String platformName = "EduTech";

    public Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
    }

    public double getFinalPrice() {
        return price;
    }
    
    public String getFormattedName() {
        // Convert to Title Case
        if (courseName == null || courseName.isEmpty()) return courseName;
        String[] words = courseName.split("\\s+");
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
            }
        }
        return titleCase.toString().trim();
    }

    public void display() {
        System.out.println("Course: " + getFormattedName() + " | Platform: " + platformName + " | Final Price: Rs." + getFinalPrice());
    }
}

class RecordedCourse extends Course {
    public RecordedCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }

    @Override
    public double getFinalPrice() {
        return price * 0.90; // 10% discount
    }
}

class LiveCourse extends Course {
    public LiveCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }

    @Override
    public double getFinalPrice() {
        return price * 0.95; // 5% discount
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        Course c1 = new RecordedCourse(1, "java masterclass", 1000);
        Course c2 = new LiveCourse(2, "ADVANCED python For Data Science", 2000);

        // Polymorphic display
        c1.display();
        c2.display();
    }
}
