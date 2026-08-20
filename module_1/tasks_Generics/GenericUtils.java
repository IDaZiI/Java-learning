package module_1.tasks_Generics;

import java.util.List;

public class GenericUtils {
    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

    public static <T extends Number> double getDoubleValue(T value) {
        return value.doubleValue();
    }

    public static void printBox(Box<?> box) {
        System.out.println(box.getValue());
    }

    public static void printNumberBox(Box<? extends Number> box) {
        System.out.println(box.getValue());
    }

    public static void setInteger(Box<? super Integer> box) {
        box.setValue(100);
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static <T extends Number & Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
