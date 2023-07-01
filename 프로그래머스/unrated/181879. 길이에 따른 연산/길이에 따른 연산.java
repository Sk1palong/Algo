class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        if(11 <= num_list.length){
            for(int i : num_list){
                answer += i;
            }
        }
        else{
            for(int i : num_list){
                multi *= i;
                answer = multi;
            }
        }
        return answer;
    }
}