class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = 0;
        int start = 0;
        middle = total/num;
        start = middle - (num-1)/2;
        for(int i=0; i<num; i++) {
            answer[i] = start + i;
        }
        
        return answer;
    }
}