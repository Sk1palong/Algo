import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Queue<Character> q = new LinkedList<>();
        char[] cArr = s.toCharArray();
        
        for(char c : cArr) {
            if(q.isEmpty()) {
                q.add(c);
            }
            else {
                if(c == ')') {
                    q.poll();
                }
                else {
                    q.add(c);
                }
            }
        }
        if(q.isEmpty()) {
            answer = true;
        }
        return answer;
    }
}
// class Solution {
//     boolean solution(String s) {
//         boolean answer = true;
//         Queue<Character> q = new LinkedList<>();
        
//         for(int i=0; i<s.length(); i++) {
//             if(q.isEmpty() || s.charAt(i) == '(') {
//                 q.add('a');
//             } else if(s.charAt(i) == ')') {
//                 q.poll();
//             }
//         }
        
//         if(!q.isEmpty()) {
//             answer = false;
//         }
        
//         return answer;
//     }
// }

// import java.util.*;

// class Solution {
//     boolean solution(String s) {
//         boolean answer = true;
//         Stack<Character> stack = new Stack<>();
        
//         for(int i=0; i<s.length(); i++) {
//             if(s.charAt(i) == '(') {
//                 stack.push(s.charAt(i));
//             } else if (s.charAt(i) == ')') {
//                 if(stack.isEmpty()) {
//                     return false;
//                 } else {
//                     stack.pop();
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
// }