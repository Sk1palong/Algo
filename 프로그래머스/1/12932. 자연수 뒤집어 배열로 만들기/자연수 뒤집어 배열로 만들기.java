class Solution {
    public int[] solution(long n) {
        int len = (n+"").length();
        int[] answer = new int[len];
        int i =0;
        while(n>0){
           answer[i] = (int)(n%10) ;
            n = n / 10;
            i++;
        }
        return answer;
    }
}