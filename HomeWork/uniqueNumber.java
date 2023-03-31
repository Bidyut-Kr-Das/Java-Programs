import java.util.Scanner;

public class uniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, number, temp, freq = 0;
        System.out.print("Enter your number: ");
        number = sc.nextInt();
        for (i = 0; i <= 9; i++) {
            temp = number;
            freq = 0;
            while (temp != 0) {
                if (temp % 10 == i) {
                    freq++;
                }
                temp /= 10;
            }
            if (freq >= 2) {
                System.out.println("This is not an unique number.");
                sc.close();
                break;
            }
            // System.out.println(i);
        }
        // System.out.println(i + " ," + freq);
        if (i == 10 && freq < 2) {
            System.out.println("This is an unique number.");
        }
        sc.close();
    }
}
