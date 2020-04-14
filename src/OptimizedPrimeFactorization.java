public class OptimizedPrimeFactorization implements Runnable {
    private int limitPrimeNumber;
    private int countPrime;
    private String name;

    OptimizedPrimeFactorization(int limitPrimeNumber, String name) {
        this.limitPrimeNumber = limitPrimeNumber;
        countPrime = 0;
        this.name = name;
    }

    boolean isPrime(int number) {
        if (number == 1 || number == 2) return true;
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    void displayPrimeSequence() {
        int i = 1;
        while (countPrime < limitPrimeNumber) {
            if (isPrime(i)) {
                System.out.println(this.name+" " + i);
                countPrime++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }

    }

    @Override
    public void run() {
            displayPrimeSequence();
    }
}
