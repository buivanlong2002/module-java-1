import java.lang.ref.Cleaner;

public class GarbageCollectionDemo {
    public static void main(String[] args) {

        MyObject obj1 = new MyObject("Object 1");
        MyObject obj2 = new MyObject("Object 2");

        System.out.println("Before setting to null:");
        obj1.printInfo();
        obj2.printInfo();

        obj1 = null;
        obj2 = null;

        System.out.println("\nCalling System.gc()...");
        System.gc();

        MyObject obj3 = new MyObject("Object 3");
        MyObject obj4 = new MyObject("Object 4");
        obj4 = obj3;
        obj3 = null;
        System.out.println("\nAfter creating Object 3 and calling System.gc() again...");
        System.gc();
    }
}

// Cleaner thread: daemon thread --- setDaemon(true)
class MyObject {
    private String name;
    private static final Cleaner cleaner = Cleaner.create();

    public MyObject(String name) {
        this.name = name;
        System.out.println(name + " created.");

        cleaner.register(this, new CleanupAction(name));
    }

    public void printInfo() {
        System.out.println("MyObject: " + name);
    }

    static class CleanupAction implements Runnable {
        private String name;

        public CleanupAction(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " is being garbage collected.");
        }
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Đối tượng " + name + " đang bị thu gom...");
//    }
}
