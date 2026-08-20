package module_1.tasks_Generics;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>("Alex");
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

        System.out.println("_______3 ЗАДАЧА ДЛЯ EXTENDS____________");
        System.out.println(GenericUtils.getDoubleValue(100));
        System.out.println(GenericUtils.getDoubleValue(100.99));
        System.out.println(GenericUtils.getDoubleValue(100123131));

        GenericUtils.printBox(box);
        GenericUtils.printBox(new Box<Integer>(10));

        GenericUtils.printNumberBox(new Box<Integer>(10));

        Box<Integer> integerBox = new Box<>(10);
        Box<Number> numberBox = new Box<>(10.5);
        Box<Object> objectBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(10.5);
        GenericUtils.setInteger(integerBox);
        GenericUtils.setInteger(numberBox);
        GenericUtils.setInteger(objectBox);
        
        System.out.println("__________LIST_________");

        List<Integer> listInt = new ArrayList<>();
        GenericUtils.addNumbers(listInt);
        List<Number> listNum = new ArrayList<>();
        GenericUtils.addNumbers(listNum);
        List<Object> listObj = new ArrayList<>();
        GenericUtils.addNumbers(listObj);
        //List<Double> listDouble = new ArrayList<>();
        //GenericUtils.addNumbers(listDouble);

        System.out.println("__________LAST-PART_________");
        Repository<User> users = new Repository<>();
        users.add(new User("Alice"));
        users.add(new User("Bob"));
        System.out.println(users.get(1).getName());
        System.out.println(users.size());

        Repository <String> stringRep = new Repository<>();
        stringRep.add("Hello");
        stringRep.add("World");
        stringRep.add("!");
        System.out.println(stringRep.get(1));
        System.out.println(stringRep.size());
    }
}