package homeworkweek8;

import java.util.Scanner;

public class Ex10armstrongNumber {

    public static void main(String[] args) {
        Ex10armstrongNumber obj = new Ex10armstrongNumber();
        main1();
    }

    public static void main1() {
        int num = 0, originalNum, remainder, result = 0;
    System.out.println("Enter a three-digit integer: ");
        Scanner s=new Scanner(System.in);
        num = s.nextInt();
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += remainder * remainder * remainder;
            originalNum /= 10;
        }

        if (result == num) {
            System.out.println(num+" is an Armstrong number.");
            //return 1;
        } else {
            System.out.println(num+" is not an Armstrong number.");

            //return 0;
        }
    }
}
