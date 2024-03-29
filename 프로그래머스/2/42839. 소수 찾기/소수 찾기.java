import java.util.*;


class Solution {
    public int solution(String numbers) {
        int answer = 0;
        String max = "";
        int maxInt = 0;
        String[] sArr = numbers.split("");
        char[] cArr = numbers.toCharArray();
        
        Arrays.sort(sArr);
        for(int i=sArr.length-1; i>=0; i--) {
            max += sArr[i];
        }
        
        maxInt = Integer.parseInt(max);
        
 loop : for(int i=2; i<=maxInt; i++) {
            String s = String.valueOf(i);
            List<Character> li = new ArrayList<>();
            int cnt =0;
     
            for(char c : cArr) {
                li.add(c);
            }
         
            for(int j=0; j<s.length(); j++) {
                if(!li.contains(s.charAt(j))) {
                    continue loop;
                } else {
                    li.remove(li.indexOf(s.charAt(j)));
                }
            }
            
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i % j == 0) {
                    continue loop;
                }
            }
            answer++;
            
        }
        
        return answer;
    }
}