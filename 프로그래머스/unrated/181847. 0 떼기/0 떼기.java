class Solution {
    public String solution(String n_str) {
        String answer = "";
        int cnt = 0;
        if(n_str.startsWith("0")){
            while(n_str.charAt(cnt)=='0'){
                cnt++;
            }
        answer = n_str.substring(cnt);
        }
        else{
            answer = n_str;
        }
        System.out.println();
        return answer;
    }
}