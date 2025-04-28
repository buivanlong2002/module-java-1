public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrimeLazy(number)) {
                System.out.println("Lazy Prime: " + number);
            }
            number++;
        }
    }

    private boolean isPrimeLazy(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
