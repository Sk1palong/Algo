class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder("0");
        for (int i = food.length-1; i >= 1; i--) {
            for (int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }
        }
        answer += sb.reverse().toString();
        answer += sb.reverse().toString();
        answer = answer.replace("00","0");
            return answer;
        
        
    }
}