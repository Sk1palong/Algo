import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer =new int[score.length];
        ArrayList<Integer> hof = new ArrayList<>();

        for(int i=0;i<score.length;i++){
            if(i<=k-1) {
                hof.add(score[i]);
                hof.sort(Comparator.naturalOrder());
                answer[i]=hof.get(0);
            }
            else{
                hof.sort(Comparator.naturalOrder());
                if(hof.get(0)<score[i]) {
                    hof.remove(0);
                    hof.add(score[i]);
                    hof.sort(Comparator.naturalOrder());
                }
                answer[i]=hof.get(0);
            }
        }
        return answer;
    }
}