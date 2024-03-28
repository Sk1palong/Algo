import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;       
        
        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    x = j;
                    y = i;
                }
            }
        }
        
        for(int i=0; i<routes.length; i++) {
            for(int j=0; j<routes[i].charAt(2)-'0'; j++) {
                char op = routes[i].charAt(0);
                if(op == 'E') {
                    x++;
                    if(x == park[y].length() || park[y].charAt(x) == 'X') {
                        x -= j+1;
                        break;
                    }
                }
                if(op == 'W') {
                    x--;
                    if(x < 0 || park[y].charAt(x) == 'X') {
                        x += j+1;
                        break;
                    }
                }
                if(op == 'N') {
                    y--;
                    if(y < 0 || park[y].charAt(x) == 'X') {
                        y += j+1;
                        break;
                    }
                }
                if(op == 'S') {
                    y++;
                    if(y == park.length || park[y].charAt(x) == 'X') {
                        y -= j+1;
                        break;
                    }
                }
            }
        }
        
        answer[0] = y;
        answer[1] = x;

        return answer;
    }
}