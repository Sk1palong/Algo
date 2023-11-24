class Solution {
    public String solution(String s) {
        String answer = "";
        int leng = s.length();
        if(leng%2==1){
            answer += s.charAt(leng/2);
        } else {
            answer = s.charAt(leng/2 -1)+"" + s.charAt(leng/2)+"";
        }
        return answer;
    }
}