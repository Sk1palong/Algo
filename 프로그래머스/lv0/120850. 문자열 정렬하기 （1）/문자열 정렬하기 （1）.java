import java.util.ArrayList;
import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer>list = new ArrayList<>();
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(48<=arr[i] && arr[i]<=57){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        int[] intArr = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            intArr[i] = list.get(i);
        }
        for(int i = 0; i<intArr.length; i++){
            answer[i] = my_string.charAt(intArr[i])-48;
        }
        Arrays.sort(answer);
        return answer;
    }
}