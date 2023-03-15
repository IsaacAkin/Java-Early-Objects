import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {

        int day;
        int month;
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("What day is it? ");
        day = input.nextInt();

        System.out.print("What month is it? ");
        month = input.nextInt();

        System.out.print("What year is it? ");
        year = input.nextInt();

        Date dateToday = new Date(day, month, year);

        String todayDate = dateToday.displayDate();

        input.close();

        System.out.printf("\nToday's date is: %s%n", todayDate);
    }
}
