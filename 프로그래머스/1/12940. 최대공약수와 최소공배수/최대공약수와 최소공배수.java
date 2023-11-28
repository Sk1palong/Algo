class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = n > m ? gcd(n, m) : gcd(m, n);
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    public int gcd(int a, int b){
        while(b > 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}