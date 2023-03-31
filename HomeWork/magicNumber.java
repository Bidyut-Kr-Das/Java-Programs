import java.util.Scanner;

public class magicNumber {
    public static int isMagic(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        if (sum > 9) {
            isMagic(sum);
        }
        if (sum < 10 && sum != 1) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number;
        number = sc.nextInt();
        if (isMagic(number) == 1) {
            System.out.println("This is a magic number");
        } else {
            System.out.println("this is not a magic number");
        }
        sc.close();
    }
}