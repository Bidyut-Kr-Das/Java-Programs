import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {      
        Scanner sc= new Scanner(System.in);
        int num,sum=0;
        System.out.print("Enter number: ");
        num=sc.nextInt();
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("This is a perfect number.");
        }
        else{
            System.out.println("This is not perfect number.");
        }
        sc.close();
    }

}
