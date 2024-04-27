import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        List<String> binLi1 = new ArrayList<>();
        List<String> binLi2 = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            while(binary1.length() != n) {
                binary1 = 0 + binary1;
            }
            while(binary2.length() != n) {
                binary2 = 0 + binary2;
            }
            binLi1.add(binary1);
            binLi2.add(binary2);
            
        }
        
        
        for(int i=0; i<n; i++) {
            String s = "";
            for(int j=0; j<n; j++) {
                if(binLi1.get(i).charAt(j) == '1' || binLi2.get(i).charAt(j) == '1') {
                    s += "#";
                } else {
                    s += " ";
                } 
            }
            answer[i] = s;
        }
        
        return answer;
    }
}