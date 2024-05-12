import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int leng = attacks.length;
        int hp = health;
        int con = bandage[0];
        int heal = bandage[1];
        int bonus = bandage[2];
        int duration = 0;
        int time = 0;
        int idx = 0;
        
        while(hp > 0) {
            time++;
            
            if(time == attacks[idx][0]) {
                hp -= attacks[idx][1];
                duration = 0;
                idx++;
            }
            else if(hp + heal <= health) {
                hp += heal;
                duration++;
            }
            else {
                hp = health;
                duration++;
            }
            
            if(duration == con) {
                duration = 0;
                hp += bonus;
                if(hp > health) {
                    hp = health;
                }
            }
            if(time == attacks[leng-1][0]) {
                break;
            }
            // System.out.println("time: " + time);
            // System.out.println("hp : " + hp);

        }
        // System.out.println(hp);
        
        
        return hp > 0 ? hp : -1;
    }
}