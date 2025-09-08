package Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance, double depositAmount, double withdrawAmount) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountHolderName(String newName) {
        this.accountHolderName = newName;
        return accountHolderName;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Withdraw Amount: " + withdrawAmount);
    }
}
