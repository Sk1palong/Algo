class Solution {
    public String solution(int n) {
        String answer = "";
        String soo = "수";
        String bak = "박";
        for(int i=0; i<n; i++){
            answer += i%2 == 0 ? soo : bak ;
        }
        return answer;
    }
}