class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(183993));
    }

    private static int countDigits(int i) {
        int count = 0;
        while (i > 0) {
            i = i / 10;
            count++;
        }
        return count;
    }
}