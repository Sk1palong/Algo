import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> li = new ArrayList<>();
        li.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1] != arr[i]) {
                li.add(arr[i]);
            }
        }
        
        int[] answer = new int[li.size()];
        for(int i =0; i<li.size(); i++) {
            answer[i] = li.get(i);
        }
        
        
        return answer;
    }
}