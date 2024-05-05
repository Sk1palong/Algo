import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int leng = number.length() - k;
        int start = 0;
        
        for(int i=0; i<leng; i++) {
            char max = '0';
            for(int j=start; j<=i + k; j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j);
                    start = j+1;
                }
            }
            sb.append(max);
        }
        
        return sb.toString();
    }
}
