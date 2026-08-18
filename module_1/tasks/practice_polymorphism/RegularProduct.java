package module_1.tasks.practice_polymorphism;

public class RegularProduct extends Product {
    @Override
    void calculatePrice() {
        System.out.println("Обычная цена");
    }
}
