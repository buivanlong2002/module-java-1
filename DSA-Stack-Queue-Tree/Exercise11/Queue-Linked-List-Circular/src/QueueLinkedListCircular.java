public class QueueLinkedListCircular {
    public static void main(String[] args) {

    }
    public class Node {
        public int data;
        public Node link;
        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public class circularQueue {
        public Node front;
        public Node rear;
        public circularQueue() {
            front = null;
            rear = null;
        }
        public void enQueue(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                front = rear = newNode;
                rear.link = front;
            } else {
                rear.link = newNode;
                rear = newNode;
                rear.link = front;
            }
        }
        public Integer deQueue() {
            if (front == null) {
                return null;
            }
            if (front == rear) {
                front = rear = null;
            } else {
                front.link = front;
                rear.link = front;
            }
            return front.data;
        }
        public void displayQueue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = front;
            do {
                System.out.print(temp.data + " ");
                temp = temp.link;
            } while (temp != null);
            System.out.println();
        }
    }
}
