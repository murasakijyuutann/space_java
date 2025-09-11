package BankProject;

import java.util.LinkedList;

public class Main {

     public static void clearLine() {
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {

        LinkedList<Account> accounts = new LinkedList<>();

        Account acc1 = new Account("佐藤善明", "123456");
        Account acc2 = new Account("佐藤紡", "654321");
        Account acc3 = new Account("佐藤太郎", "112233");

        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        clearLine();

        setInitialBalance(acc1, 100000.0);
        setInitialBalance(acc2, 20000.0);
        setInitialBalance(acc3, 30000.0);

       for (Account acc : accounts) {
            printAccountSummary(acc);
        }

        performDeposit(acc1, 5000.0);
        performDeposit(acc2, 3000.0);
        performDeposit(acc3, 7000.0);

        for (Account acc : accounts) {
            printAccountSummary(acc);
        }

        clearLine();

        performWithdrawal(acc3, 2000.0);
        for (Account acc : accounts) {
            printAccountSummary(acc);
        }

    }
    
    public static void setInitialBalance(Account account, double amount) {
        account.setBalance(amount);
        System.out.println("Initial balance set for " + account.getAccountHolderFullName() + ": " + account.getBalance());
        clearLine();
    }


    public static void performDeposit(Account account, double amount) {
        double previous = account.getBalance();
        account.deposit(amount);
        System.out.printf("Deposited: %.2f + Previous Balance: %.2f → Current Balance: %.2f%n",
            amount, previous, account.getBalance());
        clearLine();
    }
    
    public static void performWithdrawal(Account account, double amount) {
        double previous = account.getBalance();
        account.withdraw(amount);
        System.out.printf("Withdrew: %.2f + Previous Balance: %.2f → Current Balance: %.2f%n",
                amount, previous, account.getBalance());
        clearLine();
    }

    public static void printAccountSummary(Account account) {
    System.out.println("Account Holder : " + account.getAccountHolderFullName());
    System.out.println("Account Number : " + account.getAccountNumber());
    System.out.printf("Balance        : %.2f円%n", account.getBalance());

    System.out.println("Transactions   :");
    if (account.getTransactionCount() == 0) {
        System.out.println("   (No transactions)");
    } else {
        for (int i = 0; i < account.getTransactionCount(); i++) {
            System.out.printf("   [%d] %s%n", i + 1, account.getTransactions()[i]);
        }
    }
    clearLine();
}

}
