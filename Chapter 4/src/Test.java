public class Test {
    public static void main(String[] args) {
        int product = 1;
        System.out.println("The first product is 1");

        while (product <= 100) {
            product *= 3;
            System.out.printf("The next product is %d\n", product);
        }

        System.out.printf("There are %d products in total", product);
    }
}
