public class MyLinkedList {
    private int numNodes;
    private Node head;
    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }
    private static class Node {
        private Object data;
        private Node next;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
        public String toString() {
            return this.data.toString();
        }
    }
    public void add(int index, Object data) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        numNodes++;
    }
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
