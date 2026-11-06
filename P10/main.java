
class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder,
                long accountNumber,
                double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount b = new BankAccount("Rahul", 123456789, 5000);

        System.out.println("Initial Account Details:");
        b.display();

        System.out.println("\nValid Deposit:");
        b.deposit(2000);

        System.out.println("\nInvalid Deposit:");
        b.deposit(-500);

        System.out.println("\nValid Withdrawal:");
        b.withdraw(1000);

        System.out.println("\nInvalid Withdrawal:");
        b.withdraw(-200);

        System.out.println("\nInsufficient Balance:");
        b.withdraw(10000);

        System.out.println("\nFinal Account Details:");
        b.display();
    }
}

