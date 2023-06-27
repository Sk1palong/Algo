class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] arr = new String[my_string.length()/m];
        for(int i = 0; i <my_string.length()/m; i++){
            arr[i] = my_string.substring(m*i);
            answer += String.valueOf(arr[i].charAt(c-1));
        }

        return answer;

    }
}