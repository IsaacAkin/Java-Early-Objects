// Incomplete: Needs smallest and largest to be figured out

import java.util.Scanner;

public class SmallestAndLargest {

    public SmallestAndLargest() {

        Scanner userInput = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;
        int average;
        int product;
        // int smallest;
        // int largest;

        System.out.print("Enter the first integer: ");
        number1 = userInput.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = userInput.nextInt();

        System.out.print("Enter the third integer: ");
        number3 = userInput.nextInt();

        userInput.close();

        sum = number1 + number2 + number3;
        average = (number1 + number2 + number3) / 3;
        product = number1 * number2 * number3;

        System.out.printf("The sum of %d, %d and %d is: %d%n", number1, number2, number3, sum);
        System.out.printf("The average of %d, %d and %d is: %d%n", number1, number2, number3, average);
        System.out.printf("The product of %d, %d and %d is: %d%n", number1, number2, number3, product);
    }
}
