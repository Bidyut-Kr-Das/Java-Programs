import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number,ReverseNumber=0,num;
        System.out.print("Enter your Number: ");
        number = sc.nextInt();
        num= number;

        while(num!=0){
            ReverseNumber = (ReverseNumber*10)+(num%10);
            num = num/10;
        }
        if(ReverseNumber==number){
            System.out.println("This is a palindrome Number. ");

        }
        else{
            System.out.println("This is not a palindrome Number. ");
        }
        sc.close();
    }
}
