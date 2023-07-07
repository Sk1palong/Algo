import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger ia = new BigInteger(a);
        BigInteger ib = new BigInteger(b);
        answer = String.valueOf(ia.add(ib));

        return answer;
    }
}