package Prime;

public class SieveAlgorithm {

    public static void sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            System.out.println(i + " → " + isPrime[i]);
        }
    }

    public static void main(String[] args) {
        int limit = 50;
        sieveOfEratosthenes(limit);
    }
}
