class Solution {
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        int[] answer = {gcd(a, b), lcm(a, b)};
        return answer;
    }
    
    public int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
    
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}