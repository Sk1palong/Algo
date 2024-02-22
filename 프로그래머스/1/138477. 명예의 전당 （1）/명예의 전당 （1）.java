import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hof = new ArrayList<>();
        
        for(int i=0; i<score.length; i++) {
            if(i < k){
                hof.add(score[i]);
                Collections.sort(hof);
                answer[i] = hof.get(0);
            }
            else {
                hof.add(score[i]);
                Collections.sort(hof);
                hof.remove(0);
                answer[i] = hof.get(0);
            }
        }
        return answer;
    }
}