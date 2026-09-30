// Class that represents a simple bank account
public class BankAccount {
   private String owner;
   private double balance;
 
   public BankAccount(String o, double b) {
      owner = o;
      balance = b;
   }
 
   public void deposit(double amount) {
      balance = balance + amount;
   }
 
   public void printInfo() {
      System.out.println(owner + " — Balance: $" + balance);
   }
}

// Tester class that creates and updates bank accounts
class BankTester {
   public static void main(String[] args) {
      // write code to create two BankAccount objects:


BankAccount alex = new BankAccount("Alex", 100);
BankAccount jamie = new BankAccount("Jamie", 250);
 
      // deposit $50 into Alex’s account


alex.deposit(50.0);
 
      // print both accounts’ information


alex.printInfo();
jamie.printInfo();


   }
}

