import javax.swing.*;
// import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        int number1;
//        int number2;
//        int sum;
//
//        System.out.print("Enter the first integer: ");
//        number1 = input.nextInt();
//
//        System.out.print("Enter the second integer: ");
//        number2 = input.nextInt();
//
//        sum = number1 + number2;
//
//        System.out.printf("Sum is %d%n", sum);

        int number1;
        int number2;
        int sum;

        String stringNumber1 = JOptionPane.showInputDialog("Enter the first integer:");
        number1 = Integer.parseInt(stringNumber1);

        String stringNumber2 = JOptionPane.showInputDialog("Enter the second integer:");
        number2 = Integer.parseInt(stringNumber2);

        sum = number1 + number2;

        String calculation = String.format("%d + %d = %d", number1, number2, sum);

        JOptionPane.showMessageDialog(null, calculation);

    }
}
