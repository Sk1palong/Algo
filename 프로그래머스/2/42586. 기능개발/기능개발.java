import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
            if((100 - progresses[i]) % speeds[i] == 0) {
                q.add((100 - progresses[i]) / speeds[i]);
            } 
            else {
                q.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int cnt = 1;
        int prev = q.poll();
        while(!q.isEmpty()) {
            if(prev >= q.peek()) {
                cnt++;
                q.poll();
            }
            else {
                answer.add(cnt);
                cnt = 0;
                prev = q.peek();
            }
        }
        answer.add(cnt);
        
        return answer;
    }
}