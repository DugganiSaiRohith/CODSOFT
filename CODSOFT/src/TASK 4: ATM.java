import java.util.Scanner;
public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                
                    checkBalance();
                 
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("exiting ATM,have a nice day");
                    return;
                default:
                    System.out.println("Invalid option,Select again");
            }
        }
    }

    private void checkBalance() {
    
        double balance = account.getBalance();
       
        System.out.println("your current balance is ₹" + balance);
    }

    private void deposit(Scanner scanner) {
        System.out.print("enter depositing ammount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw(Scanner scanner) {
        System.out.print("enter the withdrawal ammount: ");
        double amount = scanner.nextDouble();

        boolean success = account.withdraw(amount);

        if (success) {
            System.out.println("Please collect your cash");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(25000.0); 
        ATM atm = new ATM(bankAccount);
        atm.start();
    }
}

