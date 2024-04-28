import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String s = "";
        
        List<String> li = new ArrayList<>();
        int idx = 0;
        while(s.length() <= t * m - 1) {
            s += Integer.toString(idx, n);
            idx++;
        }
        s = s.toUpperCase();
        
        for(int i=0; i<t; i++) {
            answer += s.charAt((p - 1) % m + m * i);
        }
        
        System.out.println(s);
        return answer;
    }
}