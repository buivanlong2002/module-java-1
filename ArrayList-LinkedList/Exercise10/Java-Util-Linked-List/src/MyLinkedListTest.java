public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList("A");
        list.addLast("B");
        list.addLast("C");
        list.addFirst("Start");
        list.add(2, "Middle");

        list.printList();

        list.remove("Middle");
        list.remove(0);
        list.printList();

        System.out.println("Size: " + list.size());
        System.out.println("Contains B? " + list.contains("B"));
        System.out.println("Index of C: " + list.indexOf("C"));

        MyLinkedList clonedList = list.clone();
        System.out.print("Cloned list: ");
        clonedList.printList();
    }
}