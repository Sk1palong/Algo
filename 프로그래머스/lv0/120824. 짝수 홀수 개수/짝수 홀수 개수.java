class Solution {
    public int[] solution(int[] num_list) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0 ; i < num_list.length; i++){
            if(num_list[i]%2 ==0){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        int[]answer = {cnt1,cnt2};
        return answer;
    }
}