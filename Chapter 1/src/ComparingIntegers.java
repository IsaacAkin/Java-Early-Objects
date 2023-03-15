import java.util.Scanner;

public class ComparingIntegers {

    public ComparingIntegers() {

        Scanner userInput = new Scanner(System.in);

        int number;
        int squaredNumber;

        System.out.print("Enter an integer: ");
        number = userInput.nextInt();
        userInput.close();

        squaredNumber = number * number;

        if (number > 100) {
            System.out.printf("%d is greater than 100%n", number);
        }

        if (squaredNumber > 100) {
            System.out.printf("%d is greater than 100%n", squaredNumber);
        }

        if (number == 100) {
            System.out.printf("%d is equal to 100%n", number);
        }

        if (squaredNumber == 100) {
            System.out.printf("%d is equal to 100%n", squaredNumber);
        }

        if (number != 100) {
            System.out.printf("%d is not equal to 100%n", number);
        }

        if (squaredNumber != 100) {
            System.out.printf("%d is not equal to 100%n", squaredNumber);
        }

        if (number < 100) {
            System.out.printf("%d is less than 100%n", number);
        }

        if (squaredNumber < 100) {
            System.out.printf("%d is less than 100%n", squaredNumber);
        }
    }

}
