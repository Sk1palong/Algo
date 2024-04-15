import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int max = people.length - 1;
        
        for(int min=0; min<people.length; min++) {
            if(min < max) {
                if(limit < people[min] + people[max]) {
                    answer++;
                    max--;
                    min--;
                }
                else {
                    answer++;
                    max--;
                }
            }
            else if(min == max) {
                answer++;
            }
        }
        
        return answer;
    }
}