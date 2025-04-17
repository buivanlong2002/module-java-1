public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        if (capacity == currentSize) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public void enQueue(int data) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        } else {
            queueArr[tail] = data;
            tail = (tail + 1) % capacity;
            currentSize++;
            System.out.println("Element " + data + " is pushed to Queue !");
        }
    }

    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop element from queue! Removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop element from queue! Removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
