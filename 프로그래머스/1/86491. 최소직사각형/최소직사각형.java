class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        for(int i=0; i<sizes.length; i++){
            int width = Math.max(sizes[i][0],sizes[i][1]);
            int height = Math.min(sizes[i][0],sizes[i][1]);
            if(width > maxW){
                maxW = width;
            }
            if(height > maxH){
                maxH = height;
            }
        }
        answer = maxW * maxH;
        return answer;
    }
}