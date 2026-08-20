package module_1.tasks_Generics;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private List<T> list = new ArrayList<>();
    
    public void add(T item) {
        list.add(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
}