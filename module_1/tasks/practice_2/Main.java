package module_1.tasks.practice_2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Боотур", 3);
        dog.name = "ВВВ";
        //Dog dog1 = new Dog();     //это не сработает, так как больше нет конструктора по умолчанию, и компиляция не пройдет
    }
}
