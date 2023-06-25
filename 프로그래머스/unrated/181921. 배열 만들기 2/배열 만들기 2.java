import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            String s = i+"";
            int cnt = 0;
            for(int j = 0; j <s.length(); j++){
                if(s.charAt(j) == 48 || s.charAt(j) == 53){
                    cnt++;
                }
            }
            if(cnt == s.length()){
                list.add(i);
            }
        }
        if (list.isEmpty()){
            list.add(-1);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}