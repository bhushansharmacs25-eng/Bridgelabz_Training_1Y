import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        
        int[][] marks = new int[n][3]; // [physics, chemistry, maths]
        double[] percentage = new double[n];
        String[] grade = new String[n];
        int index = 0;
        
        // Input marks with validation
        while(index < n) {
            System.out.print("Student " + (index+1) + " Physics: ");
            marks[index][0] = sc.nextInt();
            if(marks[index][0] < 0) continue;
            
            System.out.print("Chemistry: ");
            marks[index][1] = sc.nextInt();
            if(marks[index][1] < 0) continue;
            
            System.out.print("Maths: ");
            marks[index][2] = sc.nextInt();
            if(marks[index][2] < 0) continue;
            
            index++;
        }
        
        // Calculate percentage & grade
        for(int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if(percentage[i] >= 90) grade[i] = "A";
            else if(percentage[i] >= 80) grade[i] = "B";
            else if(percentage[i] >= 70) grade[i] = "C";
            else if(percentage[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }
        
        // Display
        for(int i = 0; i < n; i++) {
            System.out.printf("Student %d: P=%d, C=%d, M=%d, %% = %.2f, Grade=%s%n",
                i+1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
        sc.close();
    }
}
