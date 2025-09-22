package BankProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private final double amount;
    private final TransactionType.Type type;
    private final LocalDateTime timestamp;

    public Transaction(double amount, TransactionType.Type type) {
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now(); // Automatically records time
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType.Type getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
               "type=" + type +
               ", amount=" + amount +
               ", timestamp=" + timestamp +
               '}';
    }

    public String getSummary() {
        return String.format("[%s] %s: $%.2f", timestamp, type, amount);
    }

    public String getFormattedTimeStamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timestamp.format(formatter);
    }
}
