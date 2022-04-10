class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(7));
    }

    private static boolean isPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }

        return false;
    }
}
