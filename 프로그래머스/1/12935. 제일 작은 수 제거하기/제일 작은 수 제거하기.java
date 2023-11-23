import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int answer[] = {-1};
            return answer;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            list.add(n);
        }
        
        int[] answer = new int[arr.length-1];
        Arrays.sort(arr);
        for(int i=0; i<list.size(); i++){
            if(arr[0] == list.get(i)){
                list.remove(i);
            }
        }
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}