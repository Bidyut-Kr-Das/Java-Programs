import java.util.Scanner;

//if first digit is 0 then it is not a duct number else it is a duck number.

public class duckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, temp, digit = 0;
        String numberS;
        System.out.print("Enter your number: ");

        numberS = sc.nextLine();

        /*
         * When we take number from user with leading zero the zero at the first gets
         * ommitted.
         * so taking input as a string from the user.
         */
        number = Integer.parseInt(numberS);
        // String numberS = Integer.toString(number);
        // System.out.println(numberS);
        temp = number;
        int freq = 0;
        while (temp != 0) {
            digit = temp % 10;
            System.out.println("digit: " + digit);
            if (digit == 0) {
                freq++;
            }
            System.out.println("temp: " + temp);
            temp /= 10;
        }
        System.out.println("end loop.");
        System.out.println("freq: " + freq);
        if (numberS.charAt(0) == '0') {
            System.out.println("This is not a duck Number.");
        } else {
            if (freq > 0) {
                System.out.println("This is a duck Number");
            } else {
                System.out.println("There is no zero in the number.\nThis is not a duck number.");
            }
        }
        sc.close();
    }
}
