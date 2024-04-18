import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stk = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(stk.isEmpty()) {
                stk.push(c);
            }
            else if(stk.peek() == c) {
                stk.pop();
            }
            else {
                stk.push(c);
            }
            
        }
        if(stk.isEmpty()) {
            answer = 1;
        }
        
        return answer;
    }
}