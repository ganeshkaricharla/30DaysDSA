
import java.util.ArrayList;

class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(primeFactors(100));

    }

    private static ArrayList primeFactors(int n) {

        ArrayList<Integer> res = new ArrayList<>();
        if (n == 1) {
            return res;
        }

        while (n % 2 == 0) {
            res.add(2);
            n = n / 2;
        }

        while (n % 3 == 0) {
            res.add(3);
            n = n / 3;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            while (n % i == 0) {
                res.add(i);
                n = n / i;
            }

            while (n % (i + 2) == 0) {
                res.add((i + 2));
                n = n / (i + 2);
            }
        }
        if (n > 3) {
            res.add(n);
        }

        return res;
    }
}