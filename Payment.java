abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void processPayment();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment() {
        double fee = amount * 0.02; // 2% service charge for credit card
        double total = amount + fee;
        System.out.println("[Credit Card Payment]");
        System.out.println("Holder: " + cardHolderName + " | Card: " + cardNumber);
        System.out.println("Base Amount: $" + amount + " | Fee (2%): $" + fee + " | Total Processed: $" + total);
        System.out.println("--------------------------------------------------");
    }
}

class MobilePayment extends Payment {
    private String mobileNumber;
    private String provider;

    public MobilePayment(double amount, String mobileNumber, String provider) {
        super(amount);
        this.mobileNumber = mobileNumber;
        this.provider = provider;
    }

    @Override
    public void processPayment() {
        double fee = 1.5; 
        double total = amount + fee;
        System.out.println("[Mobile Payment - " + provider + "]");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Base Amount: $" + amount + " | Fixed Fee: $" + fee + " | Total Processed: $" + total);
        System.out.println("--------------------------------------------------");
    }
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
  
        Payment[] payments = new Payment[3];
        
        payments[0] = new CreditCardPayment(250.00, "1234-5678-9012", "Alice");
        payments[1] = new MobilePayment(50.00, "+8801700000000", "bKash");
        payments[2] = new CreditCardPayment(1200.00, "9876-5432-1098", "Bob");

        for (Payment payment : payments) {
            payment.processPayment();
        }
    }
}
