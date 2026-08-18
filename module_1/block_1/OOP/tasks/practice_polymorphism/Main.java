package module_1.block_1.OOP.tasks.practice_polymorphism;

public class Main {
    static void processProduct(Product product) {
        product.calculatePrice();
    }

    public static void main(String[] args) {
        Product product = new Product();
        Product product1 = new RegularProduct();
        Product product2 = new DiscountProduct();
        Product product3 = new DeliveryProduct();

        processProduct(product);
        processProduct(product1);
        processProduct(product2);
        processProduct(product3);
    }
}
