class Solution {
    public int solution(String[][] board, int r, int c) {
        String color = board[r][c];
        int cnt = 0;
        int[] dr = {0,0,1,-1};
        int[] dc = {1,-1,0,0};
        
        for(int i=0; i<4; i++) {
            int checkR = r + dr[i];
            int checkC = c + dc[i];
            
            if(bc(board, checkR, checkC)) {
                String checkColor = board[checkR][checkC];
                if(color.equals(checkColor)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public boolean bc(String[][] board, int r, int c) {
        int n = board.length;
        return 0 <= r && r < n && 0 <= c && c < n;
    }
}