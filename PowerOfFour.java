class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        int power = 0;
        while (Math.pow(4, power) <= n) {
            if (n == Math.pow(4, power)) {
                return true;
            }
            power++;
        }
        return false;
    }
}






class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }
}







