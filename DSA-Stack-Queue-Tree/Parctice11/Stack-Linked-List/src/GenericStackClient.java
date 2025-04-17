public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("Stack of Strings: ");
        stackOfIsStrings();
        System.out.println("Stack of Integers: ");
        stackOfIsIntegers();
    }
    public static void stackOfIsStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        System.out.println("Stack size pre: " + stack.size());
        System.out.println("Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Stack size after: " + stack.size());
    }
    public static void stackOfIsIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack size pre: " + stack.size());
        System.out.println("Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Stack size after: " + stack.size());
    }
}
