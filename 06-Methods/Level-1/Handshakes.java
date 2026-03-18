package Level_1;
import java.util.Scanner;
public class Handshakes {
    public int maxHandshakes(int n){
        int result=(n*(n-1))/2;
        return result;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int students=s.nextInt();
        Handshakes obj=new Handshakes();
        System.out.println("The maximum number of handshakes possible is :");
        System.out.println(obj.maxHandshakes(students));
    }
}
