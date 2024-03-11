class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = numbers[0] * numbers[1];
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                max = Math.max(max, numbers[i] * numbers[j]);  
            }
        }
        
        answer = max;
        
        return answer;
    }
}