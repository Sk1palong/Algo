import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer>list = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            list.add(arr[i]);
        }
        for(int i =0; i<delete_list.length; i++){
            if(list.contains(delete_list[i])){
                list.remove(list.indexOf(delete_list[i]));
            }
        }
        int[] answer =new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}