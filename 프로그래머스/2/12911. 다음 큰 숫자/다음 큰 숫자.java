class Solution {
    public int solution(int n) {
        int answer = n+1;
        int cnt = 0;
        String binary = Integer.toBinaryString(n);
        
        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                cnt++;
            }
        }
        
        while(true) {
            int cntA = 0;
            String tmp = Integer.toBinaryString(answer);
            
            for(int i=0; i<tmp.length(); i++) {
                if(tmp.charAt(i) == '1') {
                    cntA++;
                }
            }
            if(cntA == cnt) {
                break;
            }
            else {
                answer++;
            }
        }
        
        return answer;
    }
}