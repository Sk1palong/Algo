class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int i = 0;
        while (i<numLog.length-1){
            switch(numLog[i+1]-numLog[i]){
                case 1   : answer += "w"; i++; break;
                case -1  : answer += "s"; i++; break;
                case 10  : answer += "d"; i++; break;
                case -10 : answer += "a"; i++; break;
                    default : break;
                    
            }
        }
        return answer;
    }
}