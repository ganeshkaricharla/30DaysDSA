class KthBit {

    public static void main(String[] args) {
        System.out.println(checkSetBit(5, 2));
    }

    private static boolean checkSetBit(int n, int k) {
        if ((n & (1 << (k - 1))) != 0) {
            return true;
        }
        return false;
    }
}