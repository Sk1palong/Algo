import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[][] cArr = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<survey.length; i++) {
            char ch0 = survey[i].charAt(0);
            char ch1 = survey[i].charAt(1);
            if(choices[i] < 4) {
                map.put(ch0, map.getOrDefault(ch0, 0) + Math.abs(4-choices[i]));
            }
            else {
                map.put(ch1, map.getOrDefault(ch1, 0) + Math.abs(4-choices[i]));
            }
        }

        for(int i=0; i<cArr.length; i++) {
            if(map.getOrDefault(cArr[i][0], 0) >= map.getOrDefault(cArr[i][1], 0)) {
                answer += cArr[i][0];
            }
            else {
                answer += cArr[i][1]; 
            }
        }
        
        return answer;
    }
}