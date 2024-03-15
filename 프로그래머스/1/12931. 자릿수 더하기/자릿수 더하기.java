import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] sArr = str.split("");
        
        for(String s : sArr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}