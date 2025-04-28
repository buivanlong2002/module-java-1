public class TestPrime {
    public static void main(String[] args) {

        Runnable lazyPrime = new LazyPrimeFactorization();
        Runnable optimizedPrime = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyPrime);
        Thread optimizedThread = new Thread(optimizedPrime);

        lazyThread.start();
        optimizedThread.start();
    }
}
