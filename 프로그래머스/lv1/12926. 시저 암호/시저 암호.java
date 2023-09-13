import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        // System.out.println(Arrays.toString(arr));
        for(int i=0; i<s.length(); i++){
            if(arr[i] ==' '){
                continue;
            }
            if(arr[i]+n > 'z'){
                arr[i] -= 26;
            }
            else if('Z' >= arr[i] && arr[i] +n > 'Z'){
                arr[i] -= 26;
            }
            arr[i] += n;
            // System.out.println(Arrays.toString(arr));
        }
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}