import java.util.Arrays;

class PrintPrimes {
    public static void main(String[] args) {
        printPrimes(20);
    }

    private static void printPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + ", ");
            }
        }
    }
}
