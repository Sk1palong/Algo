import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> li = new ArrayList<>();
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if(!li.contains(sum)) {
                    li.add(sum);    
                }
                
            }
        }
        
        int[] answer = new int[li.size()];
        Collections.sort(li);
        
        for(int i=0; i<li.size(); i++) {
            answer[i] = li.get(i);
        }
    
        return answer;
    }
}