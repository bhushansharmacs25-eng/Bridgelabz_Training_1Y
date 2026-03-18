class Course {

    String courseName;
    int duration;
    int fee;

    static String instituteName = "GLA university";

    Course(String n, int d, int f) {
        courseName = n;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Btech", 4, 100000);
        Course c2 = new Course("bba", 4, 400000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("gla bajaj");

        c1.displayCourseDetails();
    }
}