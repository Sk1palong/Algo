class Solution {
    public String solution(int n) {
        String answer = "";
        String[] watermelon = {"수","박"};
        
        for(int i=0; i<n; i++) {
            answer += watermelon[i%2];
        }
        
        return answer;
    }
}