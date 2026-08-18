package module_1.block_1.OOP.tasks.practice_1;

public class Main {

    public static void main(String[] args) {
        /* // Два разных объекта и они независимы, тут у нас два разных независимых объекта
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Барсик";
        cat2.name = "Мурзик";

        System.out.println(cat1.name);
        System.out.println(cat2.name);
        */

        // У нас в памяти один объект, на который cat1 и cat2 оба ссылаются, 
        // поэтому когда мы делаем cat2.name = "Рыжик"; меняется также и cat1.name
        Cat cat1 = new Cat();
        cat1.name = "Барсик";

        Cat cat2 = cat1;
        cat2.name = "Рыжик";

        System.out.println(cat1.name);
        System.out.println(cat2.name);
    }

}