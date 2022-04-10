class OneOddOccuring {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 3, 4 };
        System.out.println(oneOddOccuring(arr));
    }

    private static int oneOddOccuring(int[] arr) {
        /*
         * On fact that ,
         * x^x = 0;
         * x^0 = x;
         * x^y = y^x
         */
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = temp ^ arr[i];
        }
        return temp;
    }
}
