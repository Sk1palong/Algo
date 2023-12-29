class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] c = s.toCharArray();
        
        for(int i=0; i< c.length; i++) {
                for(int j=0; j<index; j++) {
                    c[i]++;
                    if(c[i]>'z'){
                        c[i]-=26;
                    }
                    if(skip.contains(c[i]+"")) {
                        j--;
                    }
                }

            answer += c[i];
        }

        return answer;
    }
}