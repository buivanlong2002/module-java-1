import java.util.Queue;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        this.queueArr = new int[queueSize];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == capacity;
    }

    public boolean add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        return offer(data);
    }

    public boolean offer(int data) {
        if (isFull()) {
            return false;
        }
        tail = (tail + 1) % capacity;
        queueArr[tail] = data;
        currentSize++;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return poll();
    }

    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        int removed = queueArr[head];
        head = (head + 1) % capacity;
        currentSize--;
        return removed;
    }

    public int element() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return peek();
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return queueArr[head];
    }

    public int size() {
        return currentSize;
    }
}
