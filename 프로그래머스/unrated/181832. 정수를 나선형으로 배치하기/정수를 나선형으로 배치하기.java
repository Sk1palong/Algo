class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int val = 1;
        int row = 0;
        int col = 0;
        int rowEnd = n-1;
        int colEnd = n-1;
        while(val<=n*n){
            for(int i=row; i<=rowEnd; i++ ){
                answer[row][i] = val++;
            }
            row++;
            for(int i=row; i<=rowEnd; i++){
                answer[i][colEnd]=val++;
            }
            colEnd--;
            for(int i=colEnd; i>=col; i--){
                answer[rowEnd][i]=val++;
            }
            rowEnd--;
            for(int i=rowEnd; i>=row; i--){
                answer[i][col]=val++;
            }
            col++;
            
        }
        return answer;
    }
}