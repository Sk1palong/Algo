import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<=order.length; i++) {
            q.offer(i);
        }
        
        for(int i=0; i<order.length; i++) {
            if(!q.isEmpty() && q.peek() == order[i]) {
                answer++;
                q.poll();
                continue;
            }
            else if(!stk.isEmpty() && stk.peek() == order[i]) {
                answer++;
                stk.pop();
                continue;
            }
            else {
                while(!q.isEmpty() && q.peek() != order[i]) {
                    stk.push(q.poll());
                }
                if(!q.isEmpty() && q.peek() == order[i]) {
                    q.poll();
                    answer++;
                }
                else {
                    break;
                }
                
            }
        }

        return answer;
    }
}