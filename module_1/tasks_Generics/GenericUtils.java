package module_1.tasks_Generics;

public class GenericUtils {
    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }
}
