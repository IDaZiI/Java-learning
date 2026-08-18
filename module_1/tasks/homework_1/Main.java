package module_1.tasks.homework_1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.age = 1;
        dog1.name = "Боотур";
        dog1.breed = "Лайка";

        dog2.age = 5;
        dog2.name = "Лейла";
        dog2.breed = "Овчарка";

        Dog dog3 = dog1;
        dog3.name = "Новое имя";

        System.out.println(dog1.name);
        System.out.println(dog2.name);



        //закрепление и еще несколько задач (вывод Лейла, Боотур)
        //     Dog dog1 = new Dog();
        //     dog1.name = "Боотур";

        //     Dog dog2 = dog1;

        //     dog1 = new Dog();
        //     dog1.name = "Лейла";

        //     System.out.println(dog1.name);
        //     System.out.println(dog2.name);


        // ВЕСЬМА ИНТЕРЕСНОЕ НАБЛЮДЕНИЕ, мы просто убрали ссылку dog1, а ранее созданный объект еще живет в dog2, поэтосу вывод будет А,
        // а если бы сделали вывод dog1.name была бы ошибка NullPointer 
        // Dog dog1 = new Dog();
        // dog1.name = "A";

        // Dog dog2 = dog1;

        // dog1 = null;

        // System.out.println(dog2.name);
    }
}
