import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        List<Integer>list = new ArrayList<>();
        int answer = 0;
        for(int n=i; n<=j; n++){
            int tmp = n;
            while(tmp>0){
                list.add(tmp%10);
                tmp/=10;
            }
        }
        for(int m=0; m<list.size(); m++){
            if(list.get(m) == k){
                answer++;
            }
        }
        
        return answer;
    }
}