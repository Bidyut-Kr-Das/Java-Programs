import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i = 2;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("This is not prime number");
                sc.close();
                break;
            }
        }
        if (i == num) {
            System.out.println("The number is prime number");
        }
        sc.close();
    }
}
