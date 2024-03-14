import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] x = new int[4];
        int[] y = new int[4];
        
        for(int i =0; i<4; i++){
            x[i] = dots[i][0];
            y[i] = dots[i][1];
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        answer = Math.abs((x[3] - x[0]) * (y[3] - y[0]));
        
        return answer;
    }
}