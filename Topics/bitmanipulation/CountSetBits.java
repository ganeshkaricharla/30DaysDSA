class CountSetBits {

    public static void main(String[] args) {
        System.out.println(countSetBits(5));

        System.out.println(countSetBitsLookupTable(-1));
    }

    /*
     * -> Brain kerningam's algorithm.
     * 
     */
    private static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    /**
     * Lookup table method
     * 
     * Divide 32 bit number into 8 bit chunks
     * 
     */

    private static int countSetBitsLookupTable(int n) {
        if (n < 0) {
            n = -1 * n;
        }
        int[] table = new int[256];
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }

        return table[(n & 0xff)] +
                table[((n >> 8) & 0xff)] +
                table[((n >> 16) & 0xff)] +
                table[(n >> 24)];
    }
}
