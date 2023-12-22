import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        count(arrX, X);
        count(arrY, Y);
        
        for(int i = 9; i>=0; i--) {
            while(arrX[i] >= 1 && arrY[i] >= 1) {
                sb.append(i);
                
                arrX[i]--;
                arrY[i]--;
            }
        }
        
        answer = sb.toString();
        
        if (answer.equals("")) {
            return "-1";
        } else if (answer.startsWith("0")) {
            return "0";
        } else {
            return answer;
        }
        
    }
    
    private void count(int[] arr, String str) {
        for(int i = 0; i <str.length() ; i++) {
            int idx = str.charAt(i) - '0';
            arr[idx]++;
        }
    }
}