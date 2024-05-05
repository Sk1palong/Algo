import java.util.*;

class Solution {
    public int solution(int length, int weight, int[] trucks) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        int sum = 0;
        
        for(int truck : trucks) {
            while(true) {
                if(q.isEmpty()) {
                    q.offer(truck);
                    sum += truck;
                    time++;
                    break;
                }
                else if(q.size() < length) {
                    if(sum + truck <= weight) {
                        q.offer(truck);
                        sum+=truck;
                        time++;
                        break;
                    }
                    else {
                        q.offer(0);
                        time++;
                    }
                }
                else {
                    sum -= q.poll();
                }
            }
        }

        return time + length;
    }
}