package homeworkweek8;

import java.util.Scanner;

public class Ex9FibonacciExample {
    public static void main(String[] args) {
        FibonacciSeries();
    }

    public static void FibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number >5:: ");

        // Set it to the number of elements you want in the Fibonacci Series
        int maxNumber = sc.nextInt();
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }

}



