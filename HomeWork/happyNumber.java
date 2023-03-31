import java.util.Scanner;
import java.lang.Math;

public class happyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0, i;
        System.out.print("Enter your number: ");
        number = sc.nextInt();
        int temp = number;
        for (i = 0; i < 10; i++) {
            while (temp != 0) {
                int digit = temp % 10;
                // System.out.println("digit: " + digit);
                sum += (int) Math.pow(digit, 2);
                // System.out.println("sum: " + sum);
                temp /= 10;
                // System.out.println("temp: " + temp);
            }
            // System.out.println(sum);
            if (sum == 0 || sum == 1) {
                System.out.println("This is a Happy Number.");
                sc.close();
                break;
            } else {
                temp = sum;
                sum = 0;
            }
        }
        if (i == 10) {
            System.out.println("This is not a Happy Number");
        }
        sc.close();
    }
}
