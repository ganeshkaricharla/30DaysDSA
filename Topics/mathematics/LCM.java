class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(5, 1));
    }

    /*
     * Definition: LCM is least common multiple of the two numbers
     * 
     * Fact:
     * LCM*HCF = product of two numbers
     */
    private static int lcm(int a, int b) {
        int gcd = gcd(a, b);

        int lcm = a * b / gcd;

        return lcm;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
