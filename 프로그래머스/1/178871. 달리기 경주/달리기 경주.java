import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> rank = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
            rank.put(players[i], i);
            answer[i] = players[i];
        }
        
        for(String calling : callings) {
            String passed = answer[rank.get(calling) -1];
            int callingRank = rank.get(calling);
            
            rank.put(passed, callingRank);
            answer[callingRank-1] = calling;
            
            rank.put(calling, callingRank-1);
            answer[callingRank] = passed;
        }
        
        return answer;
    }
}