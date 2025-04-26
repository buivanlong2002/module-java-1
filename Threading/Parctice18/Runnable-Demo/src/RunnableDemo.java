public class RunnableDemo implements Runnable {
    private Thread thread;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.printf("Creating, %s!\n", threadName);
    }

    @Override
    public void run() {
        System.out.printf("Running %s\n", threadName);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.printf("Thread %d: %s\n", i, threadName);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.printf("Thread " + threadName + " exiting.\n");
    }

    public void start() {
        System.out.printf("Starting %s\n", threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
