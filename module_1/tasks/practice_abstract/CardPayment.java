package module_1.tasks.practice_abstract;

class CardPayment extends Payment {
    @Override 
    void pay(double amount) {
        System.out.println("Оплата картой: " + amount);
    }
}
