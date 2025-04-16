public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TESTING");
        MyLinkedList lists = new MyLinkedList(10);
        lists.addFirst(11);
        lists.addFirst(12);
        lists.addFirst("agdwg");
        lists.addFirst(15);
        lists.addFirst(16);

        lists.add(4,9);
        lists.add(5,9);
        System.out.println(lists.get(4));
        lists.printList();
    }
}