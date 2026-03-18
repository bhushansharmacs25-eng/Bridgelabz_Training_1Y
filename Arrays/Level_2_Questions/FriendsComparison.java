import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Input
        for(int i = 0; i < 3; i++) {
            System.out.print(names[i] + " age: ");
            ages[i] = sc.nextInt();
            System.out.print(names[i] + " height: ");
            heights[i] = sc.nextDouble();
        }
        
        // Find youngest
        int minAgeIndex = 0;
        for(int i = 1; i < 3; i++) {
            if(ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        
        // Find tallest
        int maxHeightIndex = 0;
        for(int i = 1; i < 3; i++) {
            if(heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        
        System.out.println(names[minAgeIndex] + " is youngest (" + ages[minAgeIndex] + ")");
        System.out.println(names[maxHeightIndex] + " is tallest (" + heights[maxHeightIndex] + ")");
        sc.close();
    }
}
