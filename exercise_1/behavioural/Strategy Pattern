// Strategy Pattern

// Strategy
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategies
class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expirationDate;

    public CreditCardStrategy(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using credit card " + cardNumber);
    }
}

class PayPalStrategy implements PaymentStrategy {
    private String email;

    public PayPalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal account " + email);
    }
}

class BankTransferStrategy implements PaymentStrategy {
    private String accountNumber;

    public BankTransferStrategy(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using bank transfer to account " + accountNumber);
    }
}

// Context
class PaymentGateway {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create payment gateway
        PaymentGateway paymentGateway = new PaymentGateway();

        // Create payment strategies
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy("1234-5678-9012-3456", "12/2025");
        PayPalStrategy paypalStrategy = new PayPalStrategy("user@example.com");
        BankTransferStrategy bankTransferStrategy = new BankTransferStrategy("1234567890");

        // Set payment strategy
        paymentGateway.setPaymentStrategy(creditCardStrategy);
        paymentGateway.pay(100);

        paymentGateway.setPaymentStrategy(paypalStrategy);
        paymentGateway.pay(200);

        paymentGateway.setPaymentStrategy(bankTransferStrategy);
        paymentGateway.pay(300);
    }
}
