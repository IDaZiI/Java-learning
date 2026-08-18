package module_1.tasks.practice_polymorphism;

public class DeliveryProduct extends Product {
    @Override
    void calculatePrice() {
        System.out.println("Цена + доставка");
    }
}
