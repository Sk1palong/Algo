import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] sArr = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<numbers.length; i++) {
            sArr[i] = numbers[i]+"";    
        }
        
        Arrays.sort(sArr, new Comparator<String>() {
           @Override
            public int compare(String s1, String s2) {
                while(true) {
                    if(s1.length() > s2.length()) {
                        for(int i=0; i<s2.length(); i++) {
                            if(s1.charAt(i) != s2.charAt(i)) {
                                return s2.substring(i, i+1).compareTo(s1.substring(i, i+1));
                            }
                        }
                        s1 = s1.substring(s2.length());
                    }
                    else if(s1.length() < s2.length()) {
                        for(int i=0; i<s1.length(); i++) {
                            if(s1.charAt(i) != s2.charAt(i)) {
                                return s2.substring(i, i+1).compareTo(s1.substring(i, i+1));
                            }
                        }
                        s2 = s2.substring(s1.length());
                    }
                    else {
                        return s2.compareTo(s1);
                    }
                }
            }
        });        
        
        for(String s : sArr) {
            sb.append(s);
        }
        
        return sb.substring(0,1).equals("0") ? "0" : sb.toString();
    }
}