import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of persons: ");
        int n = sc.nextInt();
        
        double[][] personData = new double[n][3]; // [height, weight, bmi]
        String[] status = new String[n];
        
        // Input with validation
        for(int i = 0; i < n; i++) {
            System.out.print("Person " + (i+1) + " weight(kg): ");
            personData[i][1] = sc.nextDouble();
            while(personData[i][1] < 0) {
                System.out.print("Enter positive weight: ");
                personData[i][1] = sc.nextDouble();
            }
            
            System.out.print("Person " + (i+1) + " height(m): ");
            personData[i][0] = sc.nextDouble();
            while(personData[i][0] < 0) {
                System.out.print("Enter positive height: ");
                personData[i][0] = sc.nextDouble();
            }
        }
        
        // Calculate BMI & status
        for(int i = 0; i < n; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            double bmiVal = personData[i][2];
            if(bmiVal < 18.5) status[i] = "Underweight";
            else if(bmiVal < 25) status[i] = "Normal";
            else if(bmiVal < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        
        // Display
        for(int i = 0; i < n; i++) {
            System.out.printf("Person %d: H=%.2f, W=%.2f, BMI=%.2f, %s%n", 
                i+1, personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
        sc.close();
    }
}
