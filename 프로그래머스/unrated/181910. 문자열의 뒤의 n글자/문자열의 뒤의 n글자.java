class Solution {
    public String solution(String my_string, int n) {
        int s = my_string.length();
        String answer = my_string.substring(s-n,s);
        return answer;
    }
}