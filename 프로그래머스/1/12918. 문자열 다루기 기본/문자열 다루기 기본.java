class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int leng = s.length();
        if(!(leng == 4 || leng == 6)){
            return false;
        }
        for(char c : s.toCharArray()){
            if(!('0' <= c && c <= '9')){
                return false;
            }
        }
        return answer;
    }
}