import java.util.ArrayList;

class PowerSet {
    public static void main(String[] args) {
        System.out.println(powerSet("abc"));
    }

    private static ArrayList powerSet(String s) {
        int n = s.length();
        int pow = (int) Math.pow(2, n);

        ArrayList<String> res = new ArrayList<>(pow);

        for (int i = 0; i < pow; i++) {
            String re = "";
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    re = re + s.charAt(j);
                }
            }
            res.add(i, re);
        }
        return res;
    }
}
