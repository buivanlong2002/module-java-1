public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getThread().isAlive()) {
                System.out.println("\nMain thread will be alive till the child thread is live");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Main thread run is completed");
    }
}
