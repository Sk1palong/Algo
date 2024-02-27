class Solution {
    public int solution(String s) {
        int answer = 0;
        int cntX = 0;
        int cntNonX= 0;
        char[] c = s.toCharArray();
        char x = ' ';   
        
        for(int i=0; i<c.length; i++) {
            if(cntX == 0) {
                x = c[i];
            }
            
            if(c[i] == x) {
                cntX++;
            } else {
                cntNonX++;
            }
            
            if(cntX == cntNonX) {
                answer++;
                cntX = 0;
                cntNonX = 0;
            } else if (i == c.length -1) {
                answer++;
            }
        }
        return answer;
    }
}