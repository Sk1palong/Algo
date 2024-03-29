class Solution {
    public int solution(int[] common) {
        int answer = 0;
        for(int i=0; i<common.length-2; i++) {
            if(common[i] - common[i+1] == common[i+1] - common[i+2]) {
                int gap = common[i+1] - common[i];
                answer = common[common.length-1] + gap;
            } else {
                int ratio = common[i+1]/common[i];
                answer = common[common.length-1] * ratio;
            }
        }
        return answer;
    }
}