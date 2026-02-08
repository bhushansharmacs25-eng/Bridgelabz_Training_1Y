import java.util.Scanner;

public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        int index = 0;
        
        // Input marks with validation
        while(index < n) {
            System.out.print("Student " + (index+1) + " Physics: ");
            physics[index] = sc.nextInt();
            if(physics[index] < 0) continue;
            
            System.out.print("Chemistry: ");
            chemistry[index] = sc.nextInt();
            if(chemistry[index] < 0) continue;
            
            System.out.print("Maths: ");
            maths[index] = sc.nextInt();
            if(maths[index] < 0) continue;
            
            index++;
        }
        
        // Calculate percentage & grade
        for(int i = 0; i < n; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if(percentage[i] >= 90) grade[i] = "A";
            else if(percentage[i] >= 80) grade[i] = "B";
            else if(percentage[i] >= 70) grade[i] = "C";
            else if(percentage[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }
        
        // Display
        for(int i = 0; i < n; i++) {
            System.out.printf("Student %d: P=%d, C=%d, M=%d, %% = %.2f, Grade=%s%n",
                i+1, physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
        sc.close();
    }
}
