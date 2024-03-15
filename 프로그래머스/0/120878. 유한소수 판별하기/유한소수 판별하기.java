class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int gcd = 0;
        
        while(min != 0) {
            int temp = max%min;
            max = min;
            min = temp;
        }
        gcd = max;
        b = b/gcd;
        
        while(b != 1) {
            if(b%2 == 0) {
                b/=2;
            }
            else if(b%5 == 0) {
                b/=5;
            }
            else {
                answer = 2;
                break;
            }
        }
        

        return answer;
    }
}