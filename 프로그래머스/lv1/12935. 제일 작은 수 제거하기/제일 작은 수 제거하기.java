import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        System.out.println(min);
        List<Integer>list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        list.remove(list.indexOf(min));
        int[] answer = list.isEmpty()? new int[1] : new int[list.size()];
        if(list.isEmpty()){
            answer[0] = -1;
        }
        else{
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}