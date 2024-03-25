import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            for(int j=0; j<index; j++) {
                c++;
                if('z' < c) {
                    c -= 26;
                } 
                while(skip.contains(c+"")) {
                    c++;
                    if('z' < c) {
                        c -= 26;
                    }
                }
            }
            
            
            
            answer += c;
        }
        
        
        
        return answer;
    }
}