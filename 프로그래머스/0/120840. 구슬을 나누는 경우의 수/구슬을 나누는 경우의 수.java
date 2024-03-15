import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        int answer= 0;
        BigInteger nf   = new BigInteger("1");
        BigInteger mf   = new BigInteger("1");
        BigInteger gapf = new BigInteger("1");

        for(int i=1; i<=balls; i++) {
            nf = nf.multiply(BigInteger.valueOf(i));
        }
        
        for(int i=1; i<=share; i++) {
            mf = mf.multiply(BigInteger.valueOf(i));
        }
        
        if(balls != share) {
            for(int i=1; i<= balls-share; i++) {
                gapf = gapf.multiply(BigInteger.valueOf(i));
            }
        }
        else{
            gapf = (BigInteger.valueOf(1));
        }
        
        answer = nf.divide(gapf.multiply(mf)).intValue();
        
        return answer;
    }
}