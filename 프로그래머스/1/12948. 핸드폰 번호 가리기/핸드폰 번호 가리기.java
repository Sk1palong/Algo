class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = "";
        int countingStars = phone_number.length() - 4 ;
        
        for(int i=0; i< countingStars; i++){
            star += '*';
        }
        answer = phone_number.substring(countingStars);
        
        answer = star + answer;
        return answer;
    }
}