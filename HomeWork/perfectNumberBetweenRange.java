import java.util.Scanner;
public class perfectNumberBetweenRange {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int low,high;
        System.out.print("Enter lower range: ");
        low=sc.nextInt();
        System.out.print("Enter upper range: ");
        high=sc.nextInt();
        System.out.print("perfect numbers are: ");
        for(int i=low;i<=high;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
