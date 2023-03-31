import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, product = 1, sum = 0, temp;
        System.out.print("Enter your number: ");
        number = sc.nextInt();
        temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        temp = number;
        while (temp != 0) {
            product *= temp % 10;
            temp /= 10;
        }
        if (product == sum) {
            System.out.println("This is a spy number.");

        } else {
            System.out.println("This is not a spy number.");
        }
        sc.close();
    }
}
