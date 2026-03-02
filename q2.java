// 2. Bank Account Simulation: Create a BankAccount class with fields accountNumber,
// accountHolderName, and balance. Implement methods for deposit, withdrawal,
// and displaying account details. Ensure balance does not go negative.
class BankAccount {

     private int accountNumber;
     private String accountHolderName;
     private double balance;

     public BankAccount(int accountNumber, String accountHolderName, double balance) {
          this.accountNumber = accountNumber;
          this.accountHolderName = accountHolderName;
          this.balance = balance;
     }

     public void deposit(double amount) {
          if (amount > 0) {
               balance += amount;
          } else {
               System.out.println("Deposit amount must be positive.");
          }
     }   

     public void withdraw(double amount) {
          if (amount > 0) {
               if (balance >= amount) {
                    balance -= amount;
               } else {
                    System.out.println("Insufficient balance.");
               }
          } else {
               System.out.println("Withdrawal amount must be positive.");
          }
     }   

     void displayAccountDetails() {
          System.out.println("Account Number: " + accountNumber);
          System.out.println("Account Holder Name: " + accountHolderName);
          System.out.println("Balance: $" + balance);
          System.out.println();
     }
}

public class q2 {

     public static void main(String[] args) {

          BankAccount bc = new BankAccount(12345, "John Doe", 1000.0);

          bc.displayAccountDetails();

          bc.deposit(500.0);
          bc.displayAccountDetails();

          bc.withdraw(200.0);
          bc.displayAccountDetails();

          bc.withdraw(1500.0); // Attempt to withdraw more than balance
          bc.displayAccountDetails();
     }
}

