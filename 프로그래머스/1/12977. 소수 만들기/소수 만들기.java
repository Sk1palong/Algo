import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <nums.length -2 ; i++) {
            int a = i;
            for(int j=i+1; j<nums.length -1; j++) {
                int b = j;
                for(int k = j + 1; k<nums.length; k++) {
                    int c = k;
                    list.add(nums[a]+nums[b]+nums[c]);
                }
            }
        }System.out.println(list);
        for(int n : list) {
            int cnt =0;
            for(int i=2; i<=n/2; i++) {
                if(n % i ==0) {
                    cnt++;
                }
            }
            if(cnt==0) {
                answer++;
            }
        }
        return answer;
    }
}