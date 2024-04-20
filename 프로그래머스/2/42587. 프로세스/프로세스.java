import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int priority : priorities) {
            q.add(priority);
        }
        
        while(!q.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                if(q.peek() == priorities[i]) {
                    q.poll();
                    answer++;
                    if(location == i) {
                        return answer;
                    }
                }
            }
        }        
        
        return answer;
    }
}