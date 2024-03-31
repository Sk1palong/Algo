import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++) {
            Stack<Character> stk = new Stack<>();
            String newStr = s.substring(i, s.length()) + s.substring(0,i);
            
            for(int j=0; j<newStr.length(); j++) {
                char wrap = newStr.charAt(j);
                
                if(stk.isEmpty()) {
                    stk.push(wrap);
                }
                else if (wrap == ')' && stk.peek() == '(') {
                    stk.pop();
                }
                else if (wrap == '}' && stk.peek() == '{') {
                    stk.pop();
                }
                else if (wrap == ']' && stk.peek() == '[') {
                    stk.pop();
                }
                else {
                    stk.push(wrap);
                }
            }
            if(stk.isEmpty()) {
                answer++;
            }
        }        
        return answer;
    }
}