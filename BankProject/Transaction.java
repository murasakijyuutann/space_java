package BankProject;

public class Transaction {
    private double amount;
    private TransactionType.Type type;

    public Transaction(double amount, TransactionType.Type type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType.Type getType() {
        return type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(TransactionType.Type type) {
        this.type = type;
    }

    public String toString() {
        return "" + type;
    }
}
