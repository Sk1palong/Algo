import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a, b, c, d};
        Set<Integer> set = new HashSet<>();
        Arrays.sort(dice);

        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        
        if(set.size() == 1) {
            answer = a*1111;
        }
        
        if(set.size() == 2) {
            if(dice[1] == dice[2]) {
                if(dice[0] == dice[1]) {
                    answer = 10 * dice[1] + dice[3];
                    answer *= answer;
                } 
                else {
                    answer = 10 * dice[1] + dice[0];
                    answer *= answer;
                }
            }
            else {
                answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
            }
        }
        
        if(set.size() == 3) {
            if(dice[0] == dice[1]) {
                answer = dice[2] * dice[3];
            }
            else if(dice[1] == dice[2]) {
                answer = dice[0] * dice[3];
            } else {
                answer = dice[0] * dice[1];
            }
        }
        
        if(set.size() == 4) {
            answer = dice[0];
        }
        
        return answer;
    }
}