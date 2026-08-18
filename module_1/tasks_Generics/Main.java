package module_1.tasks_Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<String>("Alex");
        System.out.println(box.getValue());
        box.setValue("Thor");
        System.out.println(box.getValue());
        
        System.out.println("_______ВТОРАЯ ЗАДАЧА ДЛЯ GENERICS-МЕТОДОВ____________");

        String[] names = {"Alex", "Bob", "Tom"};
        Integer[] numbers = {1, 2, 3};
        
        GenericUtils.printArray(names);
        GenericUtils.printArray(numbers);

        System.out.println(GenericUtils.getFirst(names));
        System.out.println(GenericUtils.getFirst(numbers));
    }
}
