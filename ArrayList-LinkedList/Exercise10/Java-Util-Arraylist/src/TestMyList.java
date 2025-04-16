import java.util.Scanner;

public class TestMyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyList<String> myList = new MyList<>();

        myList.add("Java");
        myList.add("Python");
        myList.add("C++");

        System.out.println("Initial list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        int index = sc.nextInt();
        myList.remove(index);
        System.out.println("\nlist after deleting the th element " + index + " is: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("\nContains 'C++': " + myList.contains("C++"));
        System.out.println("Index of 'Java': " + myList.indexOf("Java"));

        myList.clear();
        System.out.println("\nAfter clear, list size: " + myList.size());
    }
}