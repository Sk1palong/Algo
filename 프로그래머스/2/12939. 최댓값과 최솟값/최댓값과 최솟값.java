import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] arr = new int[sArr.length];
        
        for(int i=0; i<sArr.length; i++) {
            int temp = Integer.parseInt(sArr[i]);
            arr[i] = temp;
        }
        Arrays.sort(arr);
        
        answer = arr[0] + " " + arr[arr.length-1];
        
        return answer;
    }
}