import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++) {
            if(q.isEmpty() || s.charAt(i) == '(') {
                q.add(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                q.poll();
            }
        }
        if(!q.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}