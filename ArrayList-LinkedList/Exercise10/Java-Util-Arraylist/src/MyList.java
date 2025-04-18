public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public void add(E element) {
        if (isFull()) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void remove(int index) {
        checkIndex(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (element.equals(elements[i]))
                    return i;
        }
        return -1;
    }
}