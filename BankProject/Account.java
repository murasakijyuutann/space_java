package BankProject;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountHolderFullName;
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;
    private static final String ACCOUNT_REGEX= "^[0-9]{2,4}-[0-9]{4}-[0-9]{4,8}$";

    public Account(String accountNumber, String accountHolderFullName) {
        if (!accountNumber.matches(ACCOUNT_REGEX)) {
            throw new IllegalArgumentException("Invalid account number format. Expected format: XX-XXXX-XXXX");
        }

        this.accountHolderFullName = accountHolderFullName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>(); // Using ArrayList for dynamic sizing
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

    public List<Transaction> getTransactions() {
        return transactions;
    }

   

    public void setAccountHolderFullName(String accountHolderFullName) {
        this.accountHolderFullName = accountHolderFullName;
    }

    @Deprecated
    public void setAccountNumber(String accountNumber) {
        throw new UnsupportedOperationException("Account number cannot be changed.");
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
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
        transactions.add(transaction);
    }

    public void printTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public void printTransactionSummaries() {
        for (Transaction t : transactions) {
            System.out.println(t.getSummary());
        }
    }

    public void getTransactionsHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t.getSummary() + " at " + t.getFormattedTimeStamp());
            }
        }
    }

    public String getAccountInfo() {
        return String.format("Account Holder: %s, Account Number: %s, Balance: %.2f", accountHolderFullName, accountNumber, balance);
    }


    @Override
    public String toString() {
        return "Account{" +
                "holder='" + accountHolderFullName + '\'' +
                ", number='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}