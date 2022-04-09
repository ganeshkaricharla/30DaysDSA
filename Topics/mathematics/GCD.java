class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(5, 1));
        System.out.println(gcdOptimyzed(5, 1));
    }

    /*
     * Definition : GCD is gretest common divisor also called as Highest Common
     * factor (HCF)
     * 
     * Naive solution : Begin with minimum number and reduce one until the number
     * divides each number
     * 
     * EUCLIDEAN ALGORITHM:
     * Let b is smaller than a then gcd(a,b) = gcd(a-b,b)
     * Thesis:
     * a = gx, b = gy, gcd(x,y) = 1, gcd(a,b ) = g
     * a-b = g(x-y) , clearly a-b is also having a factor 'g'
     * 
     * 
     */
    private static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private static int gcdOptimyzed(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}