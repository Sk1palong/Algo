class Solution {
    public int solution(int a, int b) {
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        int result = Integer.parseInt(s1+s2);
        int result2 = Integer.parseInt(s2+s1);
        
        int answer = (result >= result2) ? result : result2;
        
        
        return answer;
    }
}