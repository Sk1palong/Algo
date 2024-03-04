import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] cArr = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        
        for(int i=0; i<cArr.length; i++) {
            if(!m.containsKey(cArr[i])) {
                m.put(cArr[i], i);
                answer[i] = -1;
            } else {
                answer[i] = i - m.get(cArr[i]);
                m.put(cArr[i], i);
            }
        }
        
        return answer;
    }
}