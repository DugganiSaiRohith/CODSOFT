public class BankAccount {
private double balance;
public BankAccount(double InitialBalance) {
balance = InitialBalance;
    }
	    public double getBalance() {
        return balance;
		  }

		  public void deposit(double amount) {
		      if (amount > 0) {
		          balance += amount;
		          System.out.println("Deposited Ammount ₹" + amount);
		      } else {
		          System.out.println("Invalid ammount to deposite");
		      }
		  }

		  public boolean withdraw(double amount) {
		      if (amount > 0 && amount <= balance) {
		          balance -= amount;
		          System.out.println("withdrawn ammount ₹" + amount);
		          return true;
		      } else {
		          System.out.println("Insufficient ammount or invalid amount.");
		          return false;
		      }
		  }


		}


