import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer>list = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            list.add(arr[i]);
        }
        int cnt =0;
        while(arr.length>(int)Math.pow(2,cnt)){
            cnt++;
            System.out.println(cnt);
        }
        for(int i = 0; i <(int)Math.pow(2,cnt)-arr.length; i++){
            list.add(0);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}