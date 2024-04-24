import java.util.*;

class Solution {
    public List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> dic = new HashMap<>();
        
        for(int i=0; i<26; i++) {
            dic.put(String.valueOf((char)('A'+i)), i+1);
        }
        
        for(int i=0; i<msg.length(); i++) {
            String input = msg.charAt(i) + "";
            
            for(int j=i+1; j<msg.length(); j++) {
                if(dic.containsKey(input)) {
                    input += msg.charAt(j);
                    i=j;
                }
                if(!dic.containsKey(input)) {
                    dic.put(input, dic.size() + 1);
                    input = input.substring(0, input.length() - 1);
                    i = j-1;
                    break;
                }
            }
            answer.add(dic.get(input));
        }
        
        System.out.println(dic);
        
        return answer;
    }
}