public class Main {
    public static void main(String[] args) {
        Car yamaha = new Car("Yamaha");
        Car honda = new Car("Honda");
        Car ducati = new Car("Ducati");

        Thread thread1 = new Thread(yamaha);
        Thread thread2 = new Thread(honda);
        Thread thread3 = new Thread(ducati);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
