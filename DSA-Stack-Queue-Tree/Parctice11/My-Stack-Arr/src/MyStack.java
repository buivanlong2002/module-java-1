public class MyStack {
    private int[] queueArr;
    private int size;
    private int index = 0;
    public MyStack(int size) {
        this.size = size;
        queueArr = new int[size];
    }
    public  void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        queueArr[index] = x;
        index++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return queueArr[--index];
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
