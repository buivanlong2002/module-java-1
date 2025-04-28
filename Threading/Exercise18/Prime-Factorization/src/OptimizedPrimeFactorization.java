public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrimeOptimized(number)) {
                System.out.println("Optimized Prime: " + number);
            }
            number++;
        }
    }

    private boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
