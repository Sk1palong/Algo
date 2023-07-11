class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] boomboard = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] ==1 ){
                    checkDanger(i,j,boomboard);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(boomboard[i][j] == 0 ){
                    answer ++;
                }
            }
        }

        return answer;
    }
    static void checkDanger(int x, int y, int[][] boomboard){
        int explosionX; int explosionY;
        int n = boomboard.length;
        int[] rangeX ={0,0,0,1,1,1,-1,-1,-1};
        int[] rangeY ={-1,0,1,-1,0,1,-1,0,1};
        for (int i = 0; i < 9; i++) {
            explosionX = x+rangeX[i];
            explosionY = y+rangeY[i];
            if(explosionX < n && explosionY < n && 0 <= explosionX && 0<=explosionY){
                boomboard[explosionX][explosionY] = 1;
            }
        }
    }
}