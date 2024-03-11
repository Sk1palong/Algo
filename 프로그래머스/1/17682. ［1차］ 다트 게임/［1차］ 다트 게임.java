class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String numStr = "";
        int[] dart = new int[3];
        int idx = 0;
        
        
        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if('0' <= c && c <= '9') {
                numStr += c;
            }
            
            else if(c == 'S' || c =='D' || c =='T') {
                int n = Integer.parseInt(numStr);
                if(c == 'S') {
                    dart[idx] = n;
                } else if(c == 'D') {
                    dart[idx] = (int)Math.pow(n, 2);
                } else if(c == 'T') {
                    dart[idx] = (int)Math.pow(n, 3);
                }
                idx++;
                numStr = "";
            }
            
            else if(c == '*' || c == '#') {
                if(c == '*') {
                    if(idx == 1) {
                        dart[0] *= 2;
                    } else {
                        dart[idx-2] *= 2;
                        dart[idx-1] *= 2;
                    }
                }
                else {
                    dart[idx-1] *= -1;
                }
            }
        }
        
        for(int n : dart) {
            answer += n;
        }
        
        return answer;
    }
}