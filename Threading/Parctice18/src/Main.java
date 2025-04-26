public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running!");

        RunnableDemo runnableDemo = new RunnableDemo("ThreadDemo1");
        runnableDemo.start();
        runnableDemo.run();

        RunnableDemo runnableDemo2 = new RunnableDemo("ThreadDemo2");
        runnableDemo2.start();
        runnableDemo2.run();

        System.out.println("Main thread stopped!");
    }
}
