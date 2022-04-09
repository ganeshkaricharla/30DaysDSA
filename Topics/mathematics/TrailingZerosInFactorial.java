class TrailingZeroesInFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZeroesInFactorial(100));
    }

    private static int trailingZeroesInFactorial(int num) {
        int count = 0;
        for (int i = 5; i <= num; i = i * i) {
            count = count + (num / i);
        }
        return count;
    }
}