import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> li1 = Arrays.asList(1,2,3,4,5);
        List<Integer> li2 = Arrays.asList(2,1,2,3,2,4,2,5);
        List<Integer> li3 = Arrays.asList(3,3,1,1,2,2,4,4,5,5);
        int[] score = new int[3];
        List<Integer> rank = new ArrayList<>();
        // int score1 = 0;
        // int score2 = 0;
        // int score3 = 0;
        // Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == li1.get(i%li1.size())) {
                score[0]++;
                // map.put(1, score1);
            }
            if(answers[i] == li2.get(i%li2.size())) {
                score[1]++;
                // map.put(2, score2);
            }
            if(answers[i] == li3.get(i%li3.size())) {
                score[2]++;
                // map.put(3, score3);
            }
        } 
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        for(int i=0; i<score.length; i++) {
            if(score[i] == max) {
                rank.add(i+1);
            }
        }
        
        int[] answer = new int[rank.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = rank.get(i);
        }
        
        return answer;
    }
}