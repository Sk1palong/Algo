class Solution {
    public int[] solution(int n) {
        int[] answer =new int[(n-1)/2+1];
        for (int i = 0 ; i <(n-1)/2+1 ; i++){
            answer[i] = 1+(2*i);
        }
        return answer;
    }
}