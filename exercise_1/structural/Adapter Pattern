// Adapter Pattern

// Target interface
public interface PaymentMethod {
    void pay(int amount);
}

// Adaptee interface
public interface ApplePay {
    void authorize(int amount);
    void capture(int amount);
}

// Concrete implementation of ApplePay
public class ApplePayImpl implements ApplePay {
    @Override
    public void authorize(int amount) {
        System.out.println("Authorizing Apple Pay payment...");
    }

    @Override
    public void capture(int amount) {
        System.out.println("Capturing Apple Pay payment...");
    }
}

// Adapter that converts ApplePay to PaymentMethod
public class ApplePayAdapter implements PaymentMethod {
    private ApplePay applePay;

    public ApplePayAdapter(ApplePay applePay) {
        this.applePay = applePay;
    }

    @Override
    public void pay(int amount) {
        applePay.authorize(amount);
        applePay.capture(amount);
    }
}

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, int amount) {
        paymentMethod.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        ApplePay applePay = new ApplePayImpl();
        PaymentMethod paymentMethod = new ApplePayAdapter(applePay);

        PaymentGateway paymentGateway = new PaymentGateway();
        paymentGateway.processPayment(paymentMethod, 100);
    }
}
