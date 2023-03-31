import java.util.Scanner;
import java.lang.Math;
public class NeonNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number, copyNumber,sum=0;
        System.out.print("Enter your Number: ");
        number=sc.nextInt();
        copyNumber = number;
        while(copyNumber!=0){
            sum = sum+(copyNumber%10);
            copyNumber=copyNumber/10;
        }
        sum=(int)Math.pow(sum,2);
        if(sum==number){
            System.out.println("This is a neon Number");
        }
        else{
            System.out.println("This is not a neon Number");
        }
        
        
        
        sc.close();


    }
}
