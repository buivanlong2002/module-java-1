import java.util.Arrays;

public class MyList<Interger> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa() {
            elements = Arrays.copyOf(elements, size * 2);
    }
    public void add(Object element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }
    public Interger get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (Interger) elements[index];
    }
    public String toString() {
        return Arrays.toString(elements);
    }
}
