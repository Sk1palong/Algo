class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 가장 긴변이 sides에 있을 때 
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);
        for(int i=max-min+1; i<=max; i++) {
            answer++;
        }
        // 가장 긴변이 나머지일 때 
        for(int i=max+1; i< min+max; i++) {
            answer++;
        }
        return answer;
    }
}