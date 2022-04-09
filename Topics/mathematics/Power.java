class Power {
    public static void main(String[] args) {
        System.out.println(powerRecursive(5, 3));
        System.out.println(powerIterative(5, 3));
    }

    private static int powerRecursive(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = powerRecursive(x, n / 2);
        temp = temp * temp;

        if ((n & 1) == 0) {
            // (n & 1) will give 1 if temp is odd else 0
            return temp;
        } else {
            return temp * x;
        }

    }

    private static int powerIterative(int x, int n) {
        int res = 1;
        while (n != 0) {
            //checking if last bit is 1 
            // if 1 appears then we multiply.
            if ((n & 1) == 1) {
                res = res * x;
            }

            x = x * x;
            n = n >> 1;
        }

        return res;
    }
}
