import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> fibonacci = new ArrayList<>();
        
        fibonacci.add(0);
        fibonacci.add(1);
        
        for(int i=0; i<n-1; i++) {
            fibonacci.add(fibonacci.get(i)%1234567 + fibonacci.get(i+1)%1234567);
        }
        
        // System.out.println(fibonacci);
        answer = fibonacci.get(n)%1234567;
        
        return answer;
    }
    
}