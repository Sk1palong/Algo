class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int n = Integer.parseInt(bin1,2);
        int m = Integer.parseInt(bin2,2);
        answer = Integer.toString(n+m,2);
        return answer;
    }
}