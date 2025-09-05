import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger A = new BigInteger(a, 2);
        BigInteger B = new BigInteger(b, 2);
        BigInteger ans = A.add(B);
        return ans.toString(2);
    }
}
