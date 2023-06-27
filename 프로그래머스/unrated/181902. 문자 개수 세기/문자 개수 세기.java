class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] str = my_string.toCharArray();
        for(int i = 0; i < my_string.length(); i++){
            if( 65<=str[i] && str[i]<=90){
                answer[str[i]-65]++;
        }
            else if( 97<=str[i] && str[i]<=122){
                answer[26+str[i]-97]++;
            }
        }
        return answer;
    }
}