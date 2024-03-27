class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] dots = new int[201];
        
        for(int line[] : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            for(int i=start; i<end; i++) {
                dots[i]++;
            }
        }
        
        for(int dot : dots) {
            if(dot>1) {
                answer++;
            }
        }
        
        return answer;
    }
}