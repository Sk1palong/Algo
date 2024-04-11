class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if('a' <= c && c <= 'z') {
                c += n;
                if('z' < c) {
                    c-=26;
                }
            }
            if('A' <= c && c <= 'Z') {
                c += n;
                if('Z' < c) {
                    c -= 26;
                }
            }
            answer += c;
            
        }
        return answer;
    }
}