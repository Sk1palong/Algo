import java.util.*;

class Solution {
    public long[] solution(long[] numbers) {
        int leng = numbers.length;
        long[] answer = new long[leng];
        
        for(int i=0; i<leng; i++) {
            String binStr = Long.toBinaryString(numbers[i]);      
            StringBuilder sb = new StringBuilder(binStr);

            for(int j=sb.length() - 1; j>=0; j--) {
                if(sb.charAt(j) == '0') {
                    sb.setCharAt(j, '1');
                    if(j != sb.length() - 1) {
                        sb.setCharAt(j+1, '0');
                    }
                    break;
                }
                if(j == 0) {
                    sb.insert(0, '1');
                    sb.setCharAt(1, '0');
                }
            }
            answer[i] = Long.parseLong(sb.toString(), 2);
        }
        return answer;
    }
}