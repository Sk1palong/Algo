import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> m = new HashMap<>();

        for(String s : participant) {
            if(!m.containsKey(s)) {
                m.put(s, 1);
            } else {
                m.put(s, m.get(s) + 1);
            }
        }
        
        for(String s : completion) {
            m.put(s, m.get(s) -1);
        }
        
        for(String s : participant) {
            if(m.get(s) != 0) {
                answer = s;
            }
        }
        
        // System.out.println(m.values());
        return answer;
    }
}