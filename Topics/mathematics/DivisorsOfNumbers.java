import java.util.ArrayList;

class DivisorsOfNumbers {
    public static void main(String[] args) {
        System.out.println(divisorsOfNumber(10));
    }

    private static ArrayList divisorsOfNumber(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (i != (n / i)) {
                    res.add(n / i);
                }
            }
        }
        return res;
    }
}
