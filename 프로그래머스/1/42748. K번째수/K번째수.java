import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        int start;
        int end;
        int find;
        
        for(int[] command : commands) {
            start = command[0] - 1;
            end = command[1];
            find = command[2] -1;
            
            int[] arr = Arrays.copyOfRange(array, start, end);
            Arrays.sort(arr);
            
            answer[idx] = arr[find];
            idx++;
        }
        
        return answer;
    }
}