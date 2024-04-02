class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int idx=i; idx<=j; idx++) {
            String temp = idx+"";
            
            char[] cArr = temp.toCharArray();
            for(char c : cArr) {
                if((k+"").charAt(0) == c) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}