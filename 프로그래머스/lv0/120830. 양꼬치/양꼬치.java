class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int cnt = n/10;
        answer = 12_000*n + (k-n/10)*2_000;
        return answer;
    }
}