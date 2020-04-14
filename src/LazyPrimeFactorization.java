public class LazyPrimeFactorization extends Thread {
    private int limitPrimeNumber;
    private int countPrime;

    LazyPrimeFactorization(int limitPrimeNumber) {
        this.limitPrimeNumber = limitPrimeNumber;
        countPrime = 0;
    }

    boolean isPrime(int number) {
        if (number == 1 || number == 2) return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    void displayPrimeSequence() {
        int i = 1;
        while (countPrime < limitPrimeNumber) {
            if (isPrime(i)) {
                System.out.println(this.getName() + " " + i);
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
