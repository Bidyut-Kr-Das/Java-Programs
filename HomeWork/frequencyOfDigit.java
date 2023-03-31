import java.util.Scanner;

public class frequencyOfDigit {
    public static void evenFrequency(int number) {
        for (int i = 0; i < 9; i += 2) {
            int freq = 0;
            int temp = number;
            while (temp != 0) {
                int digit = temp % 10;
                if (digit == i) {
                    freq++;
                }
                temp /= 10;
            }
            if (freq > 0) {
                System.out.println("The number " + i + " is present " + freq + " times.");
            }

        }
    }

    public static void oddFrequency(int number) {
        for (int i = 1; i <= 9; i += 2) {
            int temp = number;
            int freq = 0;

            while (temp != 0) {
                int digit = temp % 10;
                if (digit == i) {
                    freq++;
                }
                temp /= 10;
            }
            if (freq > 0) {
                System.out.println("The number " + i + " is present " + freq + " times.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter your number: ");
        number = sc.nextInt();
        System.out.println("Even number frequency:");
        evenFrequency(number);
        System.out.println("odd number frequency:");
        oddFrequency(number);
        sc.close();
    }

}
