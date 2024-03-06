import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i=0; i<dic.length; i++) {
            List<String> li = new ArrayList<>();
            for(int j=0; j<spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    li.add(spell[j]);
                }
            }
            if(spell.length == li.size()){
                answer = 1;
            }
        }
            
        return answer;
    }
}