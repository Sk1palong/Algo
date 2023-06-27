class Solution {
    public int[] solution(int money) {
        int cnt = 0;
        while(money >= 5500){
            money -= 5500;
            cnt++;
        }
        int[] answer = {cnt,money};
        return answer;
    }
}