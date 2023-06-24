import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer,Integer.MAX_VALUE);
        for (int a = 0; a<queries.length; a++){
            for(int i = queries[a][0]; i<= queries[a][1]; i++){
                if(arr[i]>queries[a][2]){
                    if(answer[a]>arr[i]){
                        answer[a] = arr[i];
                    }
                }
            }
             if(answer[a] == Integer.MAX_VALUE){
            answer[a] = -1;
        }
        }
        return answer;
    }
}