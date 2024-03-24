class Solution {
    public long solution(int price, long money, int count) {
        long answer = -1;
        long fee = price;
        
        for(int i=0; i<count; i++) {
            money -= price;
            price += fee;
        }
        
        if(money >= 0) {
            answer = 0;
        } 
        else {
            answer = -money;
        }
        
        return answer;
    }
}