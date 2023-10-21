import java.util.*;

class Solution{
    
    public int solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        // for(s의길이){
        //     stack에 s.charAt()추가 s.charAt()이 s.peek()과 같다면 추가하지 않고 pop
        // }
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            } else if(stack.peek() == s.charAt(i)){
                stack.pop();
            } else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }
        return answer;
    }
}