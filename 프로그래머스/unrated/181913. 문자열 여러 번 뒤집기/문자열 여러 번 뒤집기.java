class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String arr[] = my_string.split("");
        for (int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            while(s<=e){
                String tmp = arr[s];
                arr[s] = arr[e];
                arr[e] = tmp;
                s++; e--;
            }
        }
        for(String s : arr){
            answer += s;
        }
        return answer;
    }
}