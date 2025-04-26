public class Count implements Runnable {
    private final Thread thread;

    public Count() {
        thread = new Thread(this, "My runnable thread");
        System.out.println("Thread created " + thread);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.printf("Printing the count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread run is finished");
    }
}
