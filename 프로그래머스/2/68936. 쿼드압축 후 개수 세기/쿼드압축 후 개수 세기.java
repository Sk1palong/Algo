class Solution {
    
    static int[] answer;
    
    public boolean zip(int[][] arr, int row, int col, int size) {
        int n = arr[row][col];
        
        for(int i=row; i<row + size; i++) {
            for(int j=col; j<col + size; j++) {
                if(arr[i][j] != n) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public int[] solution(int[][] arr) {
        answer = new int[2];
        quad(arr, 0, 0, arr.length);
        
        return answer;
    }
    
    public void quad(int[][] arr, int row, int col, int size) {
        if(zip(arr, row, col, size)) {
            if(arr[row][col] == 0) {
                answer[0]++;
            }
            else {
                answer[1]++;
            }
            return;
        }
        quad(arr, row, col, size/2);
        quad(arr, row + size/2, col, size/2);
        quad(arr, row, col + size/2, size/2);
        quad(arr, row + size/2, col + size/2, size/2);
        
    }
    
}