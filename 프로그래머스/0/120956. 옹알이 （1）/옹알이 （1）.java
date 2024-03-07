import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> li = Arrays.asList("aya", "ye", "woo", "ma");
        
        for(int i=0; i<babbling.length; i++) {
            for(int j=0; j<li.size(); j++) {
                if(babbling[i].contains(li.get(j))) {
                    babbling[i] = babbling[i].replace(li.get(j), "1");
                }
            }
            
            for(int j=0; j<babbling[i].length(); j++) {
                if(babbling[i].charAt(j) != '1') {
                    answer--;
                    break;
                }
            }
            answer++;
        }

        
        
        return answer;
    }
}