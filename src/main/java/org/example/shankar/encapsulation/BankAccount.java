package org.example.shankar.encapsulation;
// Defines the package where this class belongs.

public class BankAccount {
    // Private fields: Data is hidden from outside the class (encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance (no setter to prevent direct modification)
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Business logic method to deposit money
    public void deposit(double amount){
        if (amount > 0){
            balance += amount; // Adds the deposit amount to balance
        }
    }

    // Business logic method to withdraw money
    public void withDraw(double amount){
        if(amount <= balance) {
            balance -= amount; // Deducts the amount if sufficient balance exists
        } else {
            System.out.println("Insufficient balance"); // Warning if not enough balance
        }
    }

    // Main method: Entry point to test the BankAccount class
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(); // Creating a new BankAccount object

        // Setting account number and holder name
        acc.setAccountNumber("123456789");
        acc.setAccountHolderName("John Doe");

        // Performing deposit and withdrawal operations
        acc.deposit(5000);   // Deposit ₹5000
        acc.withDraw(2000);  // Withdraw ₹2000

        // Printing account details
        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: $" + acc.getBalance());
    }
}

/*
| Concept            | How it's Used                                                                            |
        | ------------------ | ---------------------------------------------------------------------------------------- |
        | **Encapsulation**  | All fields are `private`; access is controlled using `get`/`set` methods.                |
        | **Data hiding**    | The `balance` field cannot be modified directly, only through methods.                   |
        | **Business logic** | `deposit()` and `withDraw()` enforce rules like positive amounts and sufficient balance. |
*/

/*
Encapsulation is one of the four fundamental OOP (Object-Oriented Programming) principles.
It is the process of wrapping data (variables) and code (methods) together into a single unit — usually a class — and restricting direct access to some of the object's components.
*/

/*
🧠 Key Concepts:
        ✅ 1. Data Hiding
Internal details of a class are hidden from the outside world.

Only controlled access is provided through getter and setter methods.

        ✅ 2. Access Modifiers
private → used to hide variables.

public → used for getter and setter methods to provide access.

✅ 3. Control Access
Encapsulation allows you to control how data is read or modified.

You can add validation inside setter methods.

*/


