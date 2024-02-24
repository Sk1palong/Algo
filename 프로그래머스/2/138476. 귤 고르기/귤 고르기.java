import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : tangerine) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> li = new ArrayList<>(m.values());
        Collections.sort(li, Collections.reverseOrder());
        
        int temp = 0;
        for(int i=0; i<li.size(); i++) {
            temp += li.get(i);
            if(temp >= k) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}