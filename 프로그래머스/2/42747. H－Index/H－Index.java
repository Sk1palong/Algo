import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int max = citations[citations.length-1];
        
        for(int i=0; i<max; i++) {
            int cnt = 0;
            for(int j=0; j<citations.length; j++) {
                if(citations[j] >= i) {
                    cnt++;
                }
            }
            if(i <= cnt) {
                answer = i;
            }
        }
        
        return answer;
    }
}