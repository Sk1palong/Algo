import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        int leng = n*(n+1)/2;
        List<Integer> answer = new ArrayList<>();
        int[][] matrix = new int[n][n];
        
        int row = -1;
        int col = 0;
        int val = 1;
        
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i % 3 == 0) {
                    row++;
                }
                else if(i % 3 == 1) {
                    col++;
                }
                else {
                    row--;
                    col--;
                }
                matrix[row][col] = val++;
            }
        }
        for(int[] arr : matrix) {
            for(int num : arr) {
                if(num != 0) {
                    answer.add(num);
                }
            }
        }
        
        
        return answer;
    }
}