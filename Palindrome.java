class Palindrome{
    public boolean isPalindrome(int x) {
        boolean flag = false;
        int r = 0;
        int rev = 0;

        if (x > 0) {
            int n = x;
            while (n > 0) {
                r = n % 10;
                rev = rev * 10 + r;
                n = n / 10;
            }
        }
        if (x == rev) {
            flag = true;
        }
        return flag;
    }
}
