import java.util.Arrays;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] objects = new Object[DEFAULT_CAPACITY];
    private int size = 0;

    public void add(T value) {
        if (size == DEFAULT_CAPACITY) {
            objects = Arrays.copyOf(objects, size + 10);
        }
        objects[size] = value;
        size++;
    }

    public void clear() {
        objects = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public T get(int index) {
        return (T) objects[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (size == 0) {
            return;
        } else if (size > 1) {
            for (int i = index; i < size - 1; i++) {
                objects[i] = objects[i + 1];
            }
            objects[size] = null;
            size--;
        } else if (size == 1) {
            clear();
            size = 0;
        }
    }

}
