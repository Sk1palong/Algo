class Solution {
    public long solution(int price, long money, int count) {
        long answer = -1;
        for(int i = 1; i <= count; i++){
            long fee = price * i;
            money -= fee;
        }
        answer = money > 0 ? 0 : -money; 
        return answer;
    }
}