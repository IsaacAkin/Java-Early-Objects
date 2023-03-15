import java.util.Scanner;

public class Arithmetic {

    public Arithmetic() {
        Scanner userInput = new Scanner(System.in);

        int number1;
        int number2;
        int square1;
        int square2;
        int squareNumber1;
        int squareNumber2;
        int sum;
        int difference;

        System.out.print("Enter the first integer: ");
        number1 = userInput.nextInt();
        square1 = number1 * number1;
        squareNumber1 = square1;

        System.out.print("Enter the second integer: ");
        number2 = userInput.nextInt();
        square2 = number2 * number2;
        squareNumber2 = square2;

        sum = square1 + square2;
        difference = square1 - square2;

        userInput.close();

        System.out.printf("The square of %d is %d%nThe square of %d is %d%n", number1, squareNumber1, number2,
                squareNumber2);
        System.out.printf("The sum of %d and %d is %d%n", square1, square2, sum);
        System.out.printf("The difference of %d and %d is %d%n", square1, square2, difference);
    }
}
