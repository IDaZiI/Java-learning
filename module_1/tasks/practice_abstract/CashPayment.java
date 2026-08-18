package module_1.block_1.OOP.tasks.practice_abstract;

class CashPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Оплата наличными: " + amount);
    }
    
}
