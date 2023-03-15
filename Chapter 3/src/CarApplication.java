import java.util.Scanner;

public class CarApplication {

    public static void main(String[] args) {

        String model;
        String year;
        double price;

        Scanner input = new Scanner(System.in);

        System.out.println("");
        model = input.nextLine();

        System.out.println("");
        year = input.nextLine();

        System.out.println("");
        price = input.nextDouble();

        Car car1 = new Car(model, year, price);
        Car car2 = new Car(model, year, price);

        double price1 = car1.getPrice();
        double price2 = car2.getPrice();

        double discount1 = price1 / 0.5;
        double discount2 = price2 / 0.7;

        input.close();

        // System.out.printf("", discount1.getPrice());
        System.out.printf("");

    }
}
