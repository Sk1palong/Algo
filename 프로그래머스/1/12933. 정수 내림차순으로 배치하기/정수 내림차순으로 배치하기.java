import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = n+"";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String str="";
        for(int i = c.length-1; i>=0; i--){
            str+= c[i];
        }
        answer = Long.parseLong(str);
        return answer;
    }
}