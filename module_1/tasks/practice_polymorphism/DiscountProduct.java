package module_1.tasks.practice_polymorphism;

public class DiscountProduct extends Product {
    @Override
    void calculatePrice() {
        System.out.println("Цена со скидкой");
    }
}
