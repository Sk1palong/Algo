import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String tri = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(tri);
        
        sb.reverse();
        tri = sb.toString();
        
        answer = Integer.parseInt(tri,3);

        return answer;
    }
}