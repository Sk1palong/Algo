class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    int cnt =0;
                    int sum = nums[i]+nums[j]+nums[k];
                    // System.out.println("sum : " + sum);
                    for(int m = 1; m<=sum; m++) {
                        if(sum%m == 0) {
                            cnt++;
                        }
                    }
                    if(cnt == 2) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}