package Bank;

public class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0, 0.0, 0.0) ;
        account.displayAccountInfo();

        System.out.println("=============================================================");

        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccountInfo();
        account.getAccountHolderName("Jane Smith");
    }
}
