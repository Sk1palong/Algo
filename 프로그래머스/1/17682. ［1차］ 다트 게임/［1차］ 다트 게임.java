import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String numStr = "";
        int idx = 0;
        int[] dart = new int[3]; 
        
        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if('0' <= c && c <= '9') {
                numStr += c;
            } 
            else if('D' <= c && c <= 'T') {
                int n = Integer.parseInt(numStr);
                if(c == 'S') {
                    dart[idx] = n;
                }
                else if(c == 'D') {
                    dart[idx] = (int)Math.pow(n, 2);
                }
                else if(c == 'T') {
                    dart[idx] = (int)Math.pow(n, 3);
                }
                numStr = "";
                idx++;
                
            }
            else if(c == '*' || c == '#') {
                if(c == '*') {
                    if(idx == 1) {
                        dart[idx-1] *= 2;
                    }
                    else {
                        dart[idx-2] *= 2;
                        dart[idx-1] *= 2;
                    }
                }
                else if(c == '#') {
                    dart[idx-1] *= -1;
                }
            }    
        }
        System.out.println("dart[0] = " + dart[0]);
        System.out.println("dart[1] = " + dart[1]);
        System.out.println("dart[2] = " + dart[2]);
        answer = dart[0] + dart[1] + dart[2];

        return answer;
    }
}