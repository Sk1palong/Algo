class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int j =0;
        for(int i=0; i< arr.length; i++){
            if(arr[i].equals(" ")){
                answer += " ";
                j=0;
            } else {
                answer += j%2 == 0? arr[i].toUpperCase() : arr[i].toLowerCase();
                j++;
            }
        }
        return answer;
    }
}