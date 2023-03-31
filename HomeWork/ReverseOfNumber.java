import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int number,reverseNumber=0;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while(number != 0 ){
            reverseNumber = (reverseNumber*10)+(number %10);
            number = number/10;
        }
        System.out.println("The reverse is: "+reverseNumber);
        
        sc.close();
    }
}
