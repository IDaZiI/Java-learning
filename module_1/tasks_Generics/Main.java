package module_1.tasks_Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<String>("Alex");
        System.out.println(box.getValue());
        box.setValue("Thor");
        System.out.println(box.getValue());
    }
}
