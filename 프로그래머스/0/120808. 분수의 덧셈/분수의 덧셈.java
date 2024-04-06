class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        // 기약분수 == 분자 분모를 최대공약수로 나눈 것
        // 분수끼리 덧셈 -> 분모끼리 최소공배수가 되도록 분자 분모에 곱한 뒤 더함
        int denom = lcm(denom1, denom2);
        int numer = numer1 * (denom/denom1) + numer2 * (denom/denom2);
        int gcdDN = gcd(Math.max(denom, numer), Math.min(denom, numer));
        
        answer[0] = numer/gcdDN;
        answer[1] = denom/gcdDN;
        
        return answer;
    }
    
    public int lcm(int a, int b) {
        int gcdAB = gcd(a, b);
        return a * b / gcdAB;
    }
    
    public int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}