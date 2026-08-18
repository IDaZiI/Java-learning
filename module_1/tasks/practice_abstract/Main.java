package module_1.block_1.OOP.tasks.practice_abstract;

public class Main {
    static void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }

    public static void main(String[] args) {
        processPayment(new CardPayment(), 100);
        processPayment(new CashPayment(), 100);
    }
}
