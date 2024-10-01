// Target Interface
interface PaymentProcessor {
    void pay(int amount);
}

// Adaptee
class PayPal {
    public void makePayment(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Adapter
class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pay(int amount) {
        payPal.makePayment(amount);
    }
}

// Main class
public class PaymentSystem {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        PaymentProcessor processor = new PayPalAdapter(payPal);
        processor.pay(100);  // Output: Paid 100 using PayPal.
    }
}
