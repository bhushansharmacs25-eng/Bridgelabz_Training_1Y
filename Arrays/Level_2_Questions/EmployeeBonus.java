import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        int index = 0;
        
        // Take input with validation
        while(index < 10) {
            System.out.print("Employee " + (index+1) + " salary: ");
            salary[index] = sc.nextDouble();
            if(salary[index] < 0) {
                System.out.println("Invalid salary! Enter again.");
                continue;
            }
            
            System.out.print("Employee " + (index+1) + " years: ");
            years[index] = sc.nextDouble();
            if(years[index] < 0) {
                System.out.println("Invalid years! Enter again.");
                continue;
            }
            index++;
        }
        
        // Calculate bonus
        for(int i = 0; i < 10; i++) {
            if(years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}
