import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(scoville);
        
        for(int n : scoville) {
            pq.offer(n);
        }
        
        while(pq.size() > 1 && pq.peek() < K) {
            pq.offer(pq.poll() + pq.poll() * 2);
            answer++;
        }
        
        if(pq.peek() < K) {
            answer = -1;
        }
        // System.out.println(pq);
        
        return answer;
    }
}