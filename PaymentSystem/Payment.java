package PaymentSystem;

public interface Payment {
    
    // Added enum for type-safe status handling
    public enum PaymentStatus {           // <-- added
        PENDING,
        SUCCESS,
        FAILED,
        REFUNDED
    }

    boolean processPayment(double amount);

    boolean refundPayment(String transactionId, double amount);

    // Changed return type to use enum for clarity and consistency
    PaymentStatus getPaymentStatus(String transactionId);     // <-- changed

    // Private helper for internal logging (Java 9+)
    private void logTransaction(String transactionId, double amount, String status) {
        System.out.println("Transaction ID: " + transactionId + ", Amount: " + amount + ", Status: " + status);
    }

    // Default method to print a receipt
    default void printReceipt(String transactionId, double amount) {
        System.out.println("Receipt - Transaction ID: " + transactionId + ", Amount: " + amount);
        logTransaction(transactionId, amount, "RECEIPT PRINTED");
    }

    // Optional: calculate total with tax
    default double calculateTotalWithTax(double baseAmount) {             // <-- added
        return baseAmount + (baseAmount * TAX_RATE);                      // <-- added
    }

    // Optional: declare refund capability per payment method
    default boolean supportsRefund() {                                    // <-- added
        return true;
    }

    // Optional: return latest error (e.g., for failed payments)
    default String getLastErrorMessage() {                                // <-- added
        return "No error message provided.";
    }

    // Static method to generate transaction IDs
    static String generateTransactionId() {
        return "TXN" + System.currentTimeMillis();
    }

    // Static method to mask credit card number for logging
    static String maskCardNumber(String number) {                         // <-- added
        if (number == null || number.length() < 4) return "****";
        return "**** **** **** " + number.substring(number.length() - 4);
    }

    // Constants
    String CURRENCY = "JPY";
    double TAX_RATE = 0.10; // 10% tax
    String PAYMENT_GATEWAY_URL = "https://api.payments.example.com";
    String SUPPORT_EMAIL = "Luka@vocaloid.jp";
    int MAX_RETRY_ATTEMPTS = 10;
    int TIMEOUT_SECONDS = 300; // 5 minutes
}
