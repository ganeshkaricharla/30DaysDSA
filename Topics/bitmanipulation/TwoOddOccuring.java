import java.util.ArrayList;

class TwoOddOccuring {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 3, 4, 5 };
        System.out.println(twoOddOccuring(arr));
    }

    private static ArrayList twoOddOccuring(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>(2);
        int res1 = 0, res2 = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = temp ^ arr[i];
        }

        int bit = temp & (~(temp - 1));
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & bit) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }

        res.add(0, res1);
        res.add(1, res2);
        return res;
    }
}
