import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public Object remove(int index) {
        if (index < 0 || index >= numNodes) return null;

        Node temp = head;

        if (index == 0) {
            Object removed = head.data;
            head = head.next;
            numNodes--;
            return removed;
        }

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Object removed = temp.next.data;
        temp.next = temp.next.next;
        numNodes--;
        return removed;
    }

    public boolean remove(Object o) {
        if (head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(o)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public Object get(int index) {
        if (index < 0 || index >= numNodes) return null;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public MyLinkedList clone() {
        MyLinkedList cloneList = new MyLinkedList(this.head.data);
        Node temp = this.head.next;

        while (temp != null) {
            cloneList.addLast(temp.data);
            temp = temp.next;
        }

        return cloneList;
    }

    public boolean contains(Object o) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(o)) return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }
}