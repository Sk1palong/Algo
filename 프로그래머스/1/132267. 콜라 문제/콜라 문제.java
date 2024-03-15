class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        while(n >= a) {
            temp = b * (n/a);
            answer += temp;
            temp += n%a;
            n = temp;
        }
        
        return answer;
    }
}