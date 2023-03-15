import java.util.Scanner;

public class Petrol {

    public static void main(String[] args) {

        String stationLocation;
        String petrol;
        int quantityInLitres;
        double pricePerLitre;
        double percentageDiscount;

        Scanner input = new Scanner(System.in);

        System.out.println("Where is your petrol station located in?");
        stationLocation = input.nextLine();

        System.out.println("\nWhat type of petrol are you buying?");
        petrol = input.nextLine();

        System.out.println("\nHow many litres are you planing to get?");
        quantityInLitres = input.nextInt();

        System.out.println("\nHow much does is cost for 1 litre?");
        pricePerLitre = input.nextDouble();

        System.out.println("\nWhat is the percentage discount that you get (in decimal form)?");
        percentageDiscount = input.nextDouble();

        PetrolPurchase petrolCalculator = new PetrolPurchase(stationLocation, petrol, quantityInLitres, pricePerLitre,
                percentageDiscount);

        double purchaseAmount = petrolCalculator.getPurchaseAmount();

        input.close();

        System.out.printf("\nThe price of petrol is: £%.2f", purchaseAmount);
    }
}
