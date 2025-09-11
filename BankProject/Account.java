package BankProject;

public class Account {

    private String accountHolderFullName;
    private String accountNumber;
    private double balance;
    private Transaction[] transactions;
    private int transactionCount;

    public Account(String accountHolderFullName, String accountNumber) {
        this.accountHolderFullName = accountHolderFullName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new Transaction[100]; // Fixed size for simplicity
        this.transactionCount = 0;
    }

    public String getAccountHolderFullName() {
        return accountHolderFullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setAccountHolderFullName(String accountHolderFullName) {
        this.accountHolderFullName = accountHolderFullName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction(new Transaction(amount, TransactionType.Type.DEPOSIT));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction(new Transaction(amount, TransactionType.Type.WITHDRAWAL));
        }

        else if (amount > balance) {
            System.out.println("Insufficient funds.");
        }

        else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    private void addTransaction(Transaction transaction) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount++] = transaction;
        } else {
            System.out.println("Transaction history full.");
        }
    }
}