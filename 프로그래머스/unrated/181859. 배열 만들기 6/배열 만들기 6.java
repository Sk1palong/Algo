import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer>list = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            if(list.isEmpty()){
                list.add(arr[i]);
            }
            else if(!list.isEmpty() && list.get(list.size()-1) == arr[i]){
                list.remove(list.size()-1);
            }
            else if(!list.isEmpty() && list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int j = 0; j<list.size(); j++){
            answer[j] = list.get(j);
            }
        int[] empty = {-1};
        return (list.isEmpty())? empty : answer;
    }
}