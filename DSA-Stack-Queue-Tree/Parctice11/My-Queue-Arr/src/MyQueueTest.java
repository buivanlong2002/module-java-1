public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.offer(4);
        queue.remove();
        queue.offer(56);
        queue.offer(2);
        queue.offer(67);
        queue.remove();
        queue.remove();
        queue.offer(24);
        queue.remove();
        queue.offer(98);
        queue.offer(45);
        queue.offer(23);
        queue.offer(435);
    }
}
