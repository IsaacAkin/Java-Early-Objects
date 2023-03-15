import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Display initial balance of each object
        System.out.printf("\n%s balance: £%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: £%.2f%n", account2.getName(), account2.getBalance());
        System.out.println("");
        if (account1.getBalance() < 0.0) {
            System.out.println("Account 1 is in overdraft");
        }
        if (account2.getBalance() < 0.0) {
            System.out.println("Account 2 is in overdraft\n");
        }

        // Obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to make a deposit?"); // Prompt for deposit
        String deposit = input.next();

        if (deposit.equals("yes")) {

            System.out.println("Which account do you want to make a deposit into?");
            String accountDeposit = input.next();

            if (accountDeposit.equals("account1")) {

                System.out.print("\nEnter deposit amount for account 1: £"); // Prompt
                double depositAmount = input.nextDouble(); // Obtain user input
                System.out.printf("adding £%.2f to account 1 balance... %n%n", depositAmount);
                account1.deposit(depositAmount); // Add to account 1's balance

                System.out.printf("%s balance: £%.2f%n", account1.getName(), account1.getBalance());
            } else if (accountDeposit.equals("account2")) {

                System.out.print("\nEnter deposit amount for account 2: £"); // Prompt
                double depositAmount = input.nextDouble(); // Obtain user input
                System.out.printf("adding £%.2f to account 2 balance... %n%n", depositAmount);
                account2.deposit(depositAmount); // Add to account 2's balance

                System.out.printf("%s balance: £%.2f%n", account2.getName(), account2.getBalance());
            }

        } else if (deposit.equals("no")) {
            System.out.println("Would you like to make a withdrawal?"); // Prompt for withdrawal
            String withdrawal = input.next();

            if (withdrawal.equals("yes")) {

                System.out.println("Which account do you want to make a withdrawal from?");
                String accountWithdrawal = input.next();

                if (accountWithdrawal.equals("account1")) {

                    if (account1.getBalance() < 0.0) {
                        System.out.println("Not enough funds");
                        input.close();
                        return;
                    }

                    System.out.print("\nEnter withdrawal amount for account 1: £"); // Prompt
                    double withdrawalAmount = input.nextDouble(); // Obtain user input

                    while (withdrawalAmount > account1.getBalance()) {
                        System.out.println("\nWithdrawal amount exceeds account's balance");
                        System.out.print("Please enter a valid withdrawal amount: £");
                        withdrawalAmount = input.nextDouble();
                        System.out.println("");
                    }

                    account1.withdraw(withdrawalAmount);

                    System.out.printf("withdrawing £%.2f from account 1's balance... %n%n", withdrawalAmount);
                    account1.withdraw(withdrawalAmount); // Withdraw from account 1's balance

                    System.out.printf("%s balance: £%.2f%n", account1.getName(), account1.getBalance());

                } else if (accountWithdrawal.equals("account2")) {

                    if (account2.getBalance() < 0.0) {
                        System.out.println("Not enough funds");
                        input.close();
                        return;
                    }

                    System.out.print("\nEnter withdrawal amount for account 1: £"); // Prompt
                    double withdrawalAmount = input.nextDouble(); // Obtain user input

                    while (withdrawalAmount > account2.getBalance()) {
                        System.out.println("\nWithdrawal amount exceeds account's balance");
                        System.out.print("Please enter a valid withdrawal amount: £");
                        withdrawalAmount = input.nextDouble();
                        System.out.println("");
                    }

                    account2.withdraw(withdrawalAmount);

                    System.out.printf("withdrawing £%.2f from account 1's balance... %n%n", withdrawalAmount);
                    account2.withdraw(withdrawalAmount); // Withdraw from account 2's balance

                    System.out.printf("%s balance: £%.2f%n", account2.getName(), account2.getBalance());
                }
            }
        }

        input.close();
    }
} // End class AccountTest
