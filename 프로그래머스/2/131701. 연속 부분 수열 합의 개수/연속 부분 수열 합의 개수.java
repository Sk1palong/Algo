import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int i=1; i<=elements.length; i++) { // i = 길이
            for(int j=0; j<elements.length; j++) { // j = 시작 인덱스
                int sum = 0;
                for(int k=j; k<j+i; k++) { // k = 시작인덱스부터 길이만큼 
                    sum += elements[k%elements.length];
                }
                set.add(sum);
            }
        }
        answer = set.size();
        
        return answer;
    }
}