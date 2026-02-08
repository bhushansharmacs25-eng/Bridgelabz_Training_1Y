import java.util.Scanner;

public class ArrayCopy2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        
        // Input 2D array
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Copy to 1D array
        int[] array1D = new int[rows * cols];
        int index = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                array1D[index++] = matrix[i][j];
            }
        }
        
        // Display 1D array
        System.out.print("1D Array: ");
        for(int num : array1D) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
