import java.util.Scanner;
public class primeNumberBetweenRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int low,high;
        low=sc.nextInt();
        System.out.print("Enter upper range: ");
        high=sc.nextInt();
        System.out.print("The prime numbers are: ");
        for(int i=low;i<=high;i++){
            int j=2;
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==1 || j==i){
                System.out.print(i+" ");
            }
        }   
        sc.close();
    }
}
