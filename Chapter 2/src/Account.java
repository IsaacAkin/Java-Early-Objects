// Contains a name and instance variable
// and methods to set and get its values

public class Account {

    private String name; // Instance Variable
    private double balance;

    // Constructor initializes name with parameter name
    public Account(String name, double balance) { // Constructor name is class name

        this.name = name;

        // Validate that the balance is greater than 0.0. If it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) {
            this.balance = balance; //if the balance is valid then assign it to the instance variable balance
        } else if (balance < 0.0) {
            this.balance = balance;
        }
    }

    // Method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount; // If the deposit amount is valid then add it to the balance
        }
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= balance) {
            balance -= withdrawalAmount; // If the withdrawal amount is less than or equal to the balance
                                        // then it is subtracted from the balance and becomes the new balance
        }
    }

    // Returns the account balance
    public double getBalance() {
        return balance;
    }

    // Method to set the name in the object
    public void setName(String name) {
        this.name = name; // Stores the name
    }

    // Method to retrieve the name from the object
    public String getName() {
        return name; // Return value of the name to caller
    }
} // End class account
