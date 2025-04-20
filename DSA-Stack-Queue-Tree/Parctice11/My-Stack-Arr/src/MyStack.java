import java.util.Stack;

public class MyStack {
    private int[] stackArr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        stackArr = new int[size];
    }

    public void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        stackArr[index] = x;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stackArr[--index];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stackArr[index - 1];
    }

    public int search(Object o) {
        for (int i = index - 1; i >= 0; i--) {
            if (stackArr[i] == (int) o) {
                return index - i;
            }
        }
        return -1;
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
