class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialIterative(5));

        System.out.println(factorialRecursion(5));
    }

    private static int factorialIterative(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    private static int factorialRecursion(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        return num * factorialRecursion(num - 1);
    }
}