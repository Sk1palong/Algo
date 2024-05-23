import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y+1];
        // dp[idx]가 0이면 아직 방문하지 않음 
        
        for(int i=x; i<y+1; i++) {
            if(i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }
            if(i + n <= y) {
                if(dp[i+n] == 0) {
                    dp[i+n] = dp[i] + 1;
                }
                else {
                    dp[i+n] = Math.min(dp[i+n], dp[i] + 1);
                }
            }
            if(i * 2 <= y) {
                if(dp[i*2] == 0) {
                    dp[i*2] = dp[i] + 1;
                }
                else {
                    dp[i*2] = Math.min(dp[i*2], dp[i] + 1);
                }
            }
            if(i * 3 <= y) {
                if(dp[i*3] == 0) {
                    dp[i*3] = dp[i] + 1;
                }
                else {
                    dp[i*3] = Math.min(dp[i*3], dp[i] + 1);
                }
            }
            
        }
        
        return dp[y];
    }
}