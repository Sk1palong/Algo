import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        //          R, L, U, D
        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};
        
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        
        for(char c : dirs.toCharArray()) {
            if(bc(x1, y1)) {
                if(c == 'R') {
                    x2 = x1 + dc[0];
                    y2 = y1 + dr[0];
                }
                else if(c == 'L') {
                    x2 = x1 + dc[1];
                    y2 = y1 + dr[1];
                }
                else if(c == 'U') {
                    x2 = x1 + dc[2];
                    y2 = y1 + dr[2];
                }
                else if(c == 'D') {
                    x2 = x1 + dc[3];
                    y2 = y1 + dr[3];
                }
            }
            if(bc(x2, y2)) {
                set.add(x1+ "" + y1 + "" + x2 + "" + y2 +"");
                set.add(x2+ "" + y2 + "" + x1 + "" + y1 +"");
                x1 = x2;
                y1 = y2;
            }

        }
        answer = set.size()/2;
        return answer;
    }
    
    public boolean bc(int x, int y) {
        return -5 <= x && x <= 5 && -5 <= y && y <= 5; 
    }
}