import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        List<String> binLi1 = new ArrayList<>();
        List<String> binLi2 = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            String bin1 = Integer.toBinaryString(arr1[i]);
            String bin2 = Integer.toBinaryString(arr2[i]);
            while(bin1.length() != n) {
                bin1 = 0 + bin1;
            }
            while(bin2.length() != n) {
                bin2 = 0 + bin2;
            }
            binLi1.add(bin1);
            binLi2.add(bin2);
            
        }
        
        System.out.println(binLi1); 
        System.out.println(binLi2);
        
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