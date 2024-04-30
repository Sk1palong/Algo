import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        int row = 0;
        int col = 0;
        
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(park[i].charAt(j) == 'S') {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        
        for(int i=0; i<routes.length; i++) {
            char dir = routes[i].charAt(0);
            int times = Integer.parseInt(routes[i].charAt(2)+"");
            for(int j=0; j<times; j++) {
                if(dir == 'E') {
                    col++;
                    if(!bc(park, row, col, h, w)) {
                        col -= j+1;
                        break;
                    }
                }
                else if(dir == 'W') {
                    col--;
                    if(!bc(park, row, col, h, w)) {
                        col += j+1;
                        break;
                    }
                }
                else if( dir == 'N') {
                    row--;
                    if(!bc(park, row, col, h, w)) {
                        row += j+1;
                        break;
                    }
                }
                else {
                    row++;
                    if(!bc(park, row, col, h, w)) {
                        row -= j+1;
                        break;
                    }
                }                   
            }
        }
        int[] answer = {row, col};
        
        return answer;
    }
    
    public boolean bc(String[] park, int row, int col, int h, int w) {
        return 0 <= row && row < h && 0 <= col && col < w && park[row].charAt(col) != 'X'; 
    }
}