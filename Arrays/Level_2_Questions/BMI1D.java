import java.util.Scanner;

public class BMI1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of persons: ");
        int n = sc.nextInt();
        
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        
        // Input
        for(int i = 0; i < n; i++) {
            System.out.print("Person " + (i+1) + " weight(kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Person " + (i+1) + " height(m): ");
            heights[i] = sc.nextDouble();
        }
        
        // Calculate BMI & status
        for(int i = 0; i < n; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if(bmi[i] < 18.5) status[i] = "Underweight";
            else if(bmi[i] < 25) status[i] = "Normal";
            else if(bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        
        // Display
        for(int i = 0; i < n; i++) {
            System.out.printf("Person %d: H=%.2f, W=%.2f, BMI=%.2f, %s%n", 
                i+1, heights[i], weights[i], bmi[i], status[i]);
        }
        sc.close();
    }
}
