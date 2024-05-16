import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = getSum(queue1);
        long sum2 = getSum(queue2);
        long avg = (sum1 + sum2) / 2;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(int i=0; i<queue1.length; i++) {
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }
        
        while(true) {
            if(sum1 == sum2) {
                break;
            }
            else if(sum1 > avg) {
                sum1 -= q1.peek();
                sum2 += q1.peek();
                q2.offer(q1.poll());
                
            }
            else {
                sum2 -= q2.peek();
                sum1 += q2.peek();
                q1.offer(q2.poll());
            }
            if(answer > queue1.length * 2 + 1) {
                return -1;
            }
            
            answer++;
        }
        
        return answer;
    }
    
    public long getSum(int[] arr) {
        int sum = 0;
        for(int n : arr) {
            sum += n;
        }
        return sum;
    }
}