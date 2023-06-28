import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        String str = "";
        for(int i = 0; i<num_list.length; i++){
            str+=num_list[i];
        }
        str = str.substring(n-1);
        String[] s = str.split("");
        int[]answer = new int [str.length()];
        for(int i = 0 ; i <str.length(); i++){
            answer[i] = Integer.parseInt(s[i]);
        }
        return answer;
    }
}