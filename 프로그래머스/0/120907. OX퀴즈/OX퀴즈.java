import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
            String temp = quiz[i];
            String[] tempArr = temp.split(" ");
            int first = Integer.parseInt(tempArr[0]);
            int second = Integer.parseInt(tempArr[2]);
            String executor = tempArr[1];
            int result = Integer.parseInt(tempArr[4]);
            
            if(executor.equals("+")) {
                if(first + second == result) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
            else {
                if(first - second == result) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}