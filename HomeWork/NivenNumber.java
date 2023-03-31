//Also known as Harshad Number.
import java.util.Scanner;
public class NivenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number,sum=0,newNumber=0;
        System.out.print("Enter your number: ");
        number = sc.nextInt();
        newNumber= number;
        while(newNumber!=0){
            sum +=newNumber%10;
            newNumber/=10;
        }
        if((number%sum)==0){
            System.out.println("This is a niven number.");
        }
        else{
            System.out.println("This is not a niven number.");
        }
        
        sc.close();
    }
}
