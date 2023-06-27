class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] arr = my_string.split("");
        String tmp = "";
        while(s<=e){
            tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;
            s++; 
            e--;
        }
        for(String str : arr){
            answer += str;
        }
        
        return answer;
    }
}