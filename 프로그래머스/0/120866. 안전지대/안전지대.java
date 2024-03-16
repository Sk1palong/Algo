class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] rangeX = {-1,-1,-1,0,0,0,1,1,1};
        int[] rangeY = {1,0,-1,1,0,-1,1,0,-1};
        int[][] dangerBoard = new int[board.length][board.length];
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                int temp = board[i][j];
                if(temp == 1) {
                    for(int k=0; k<rangeX.length; k++) {
                        int n = board.length;
                        int dangerX = j+rangeX[k];
                        int dangerY = i+rangeY[k];
                        if(dangerX<n && dangerY <n && 0<=dangerX && 0 <=dangerY) {
                            dangerBoard[dangerY][dangerX] = 1;
                        }
                    }
                }
            }
        }
        
        for(int[] arr : dangerBoard) {
            for(int n : arr) {
                if(n == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}