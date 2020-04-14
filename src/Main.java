public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization thread1 = new LazyPrimeFactorization(100);
        OptimizedPrimeFactorization optimizedPrime = new OptimizedPrimeFactorization(100, "thread2");
        Thread thread2 = new Thread(optimizedPrime);
        thread1.setName("thread1");

        thread2.start();
        thread1.start();


    }
}
