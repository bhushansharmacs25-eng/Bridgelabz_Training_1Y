package Level_1;
import java.util.Scanner;
public class SpringSeason {
    public boolean checkSpringSeason(int m,int d){
        boolean result=false;
        switch(m){
            case 3: if(d>=20 && d<=31){
                 result=true;
                }
                else{
                  result=false;
                }
                break;
            case 4: if(d>=1 && d<=30){
               result=true;
            }
            else{
               result=false;
            }
                break;
            case 5: if(d>=1 && d<=31){
               result=true;
            }
            else{
               result=false;
            }
                break;
            case 6: if(d>=1 && d<=20){
              result=true;
            }
            else{
               result=false;
            }
                break;
            default:
                result=false;
                break;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day and month");
        int day=s.nextInt();
        int month=s.nextInt();
        SpringSeason obj=new SpringSeason();
        boolean answer=obj.checkSpringSeason(month,day);
        if(answer==true){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
    }
}