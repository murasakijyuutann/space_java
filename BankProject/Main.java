package BankProject;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static LinkedList<Account> accounts = new LinkedList<>();

    public static void main(String[] args) {
        // try {
        while (true) {
            clearLine();
            System.out.println("===== Bank Menu =====");
            System.out.println("0. Create New Account");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. View Account Summary");
            System.out.println("5. Exit");

            System.out.print("Choose an option (0 - 5): ");

            int option = 0;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Please enter a valid number.");
                e.printStackTrace();
                continue; // Go back to menu
            }

            switch (option) {
                case 0 -> createAccount();
                case 1 -> performDeposit();
                case 2 -> performWithdrawal();
                case 3 -> performTransfer();
                case 4 -> viewAccountSummary();
                case 5 -> {
                    System.out.println("[INFO] Exiting program. Goodbye!");
                    return;
                }
                default -> System.out.println("[WARN] Invalid option. Try again.");
            }
        }
        // } catch (Exception e) {
        //     System.out.println("[FATAL ERROR] Unexpected exception: " + e.getMessage());
        //     e.printStackTrace();
        // } finally {
        //     scanner.close();
        // }

    }



    // Initial setup
    private static void createAccount() {
        System.out.print("Enter account holder's full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number (format: XX-XXXX-XXXX): ");
        String number = scanner.nextLine();

        try {
            Account newAccount = new Account(number, name);
            accounts.add(newAccount);
            System.out.println("[INFO] Account created successfully.");
            System.out.printf("[INFO] Total accounts now: %d%n", accounts.size());
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }

    // Account selector
    private static Account selectAccount(String prompt) {
        System.out.println(prompt);
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("[%d] %s (%s)%n", i, accounts.get(i).getAccountHolderFullName(), accounts.get(i).getAccountNumber());
        }
        System.out.print("Enter account index: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // consume newline
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        } else {
            System.out.println("[ERROR] Invalid account 0index.");
            return null;
        }
    }

    // Deposit
    private static void performDeposit() {
        Account acc = selectAccount("[DEPOSIT] Select account:");
        if (acc == null) return;
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        acc.deposit(amount);
        System.out.printf("[INFO] Deposit successful. New balance: %.0f$%n", acc.getBalance());
    }

    // Withdraw
    private static void performWithdrawal() {
        Account acc = selectAccount("[WITHDRAW] Select account:");
        if (acc == null) return;
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        acc.withdraw(amount);
        System.out.printf("[INFO] Withdrawal complete. New balance: %.0f$%n", acc.getBalance());
    }

    // Transfer
    private static void performTransfer() {
        Account sender = selectAccount("[TRANSFER] Select sender account:");
        if (sender == null) return;

        Account receiver = selectAccount("[TRANSFER] Select receiver account:");
        if (receiver == null || sender == receiver) {
            System.out.println("[ERROR] Invalid receiver.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount <= 0 || amount > sender.getBalance()) {
            System.out.println("[ERROR] Invalid or insufficient balance.");
            return;
        }

        sender.withdraw(amount);
        receiver.deposit(amount);
        System.out.println("[INFO] Transfer successful.");
    }

    // Account summary
    private static void viewAccountSummary() {
        Account acc = selectAccount("[SUMMARY] Select account to view:");
        if (acc == null) return;

        System.out.println("[ACCOUNT] " + acc.getAccountHolderFullName());
        System.out.println("[NUMBER]  " + acc.getAccountNumber());
        System.out.printf("[BALANCE] %.0f$%n", acc.getBalance());
        System.out.println("[HISTORY] Transaction Log:");
        if (acc.getTransactions().isEmpty()) {
            System.out.println("  No transactions.");
        } else {
            for (Transaction tx : acc.getTransactions()) {
                System.out.println("  - " + tx.getSummary());
            }
        }
    }

    // Line separator
    private static void clearLine() {
        System.out.println("--------------------------------------------------");
    }
    
}
