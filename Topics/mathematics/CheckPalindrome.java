class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome(1211221));
    }

    private static boolean checkPalindrome(int i) {

        int num = i;
        int rev = 0;
        while (i > 0) {
            rev = rev * 10 + (i % 10);
            i = i / 10;
        }

        if (rev == num) {
            return true;
        }

        return false;
    }
}