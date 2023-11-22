import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer>list = new ArrayList<>();
        for(int n : arr){
            if(n % divisor == 0){
                list.add(n);
            }
        }
        if(list.isEmpty()){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);           
           }
           Arrays.sort(answer);
        return answer;
    }
}