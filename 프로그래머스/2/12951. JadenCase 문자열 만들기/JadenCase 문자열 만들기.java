import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int idx =0;
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(" ")){
                idx =0;
            } else if (!arr[i].equals(" ") && idx == 0) {
                arr[i] = arr[i].toUpperCase();
                idx++;
            } else if (!arr[i].equals(" ") && idx != 0) {
                arr[i] = arr[i].toLowerCase();
            }
            answer += arr[i];
        } 
        
        
        return answer;
    }
}