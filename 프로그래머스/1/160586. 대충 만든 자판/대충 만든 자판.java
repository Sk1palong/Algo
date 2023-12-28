import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int size = targets.length;
        int[] answer = new int[size];
        HashMap<Character, Integer> hash = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++) {
            for(int j=0; j<keymap[i].length(); j++) {
                char alp = keymap[i].charAt(j);
                if(hash.containsKey(alp)) {
                    int idx = hash.get(alp);
                    hash.put(alp, Math.min(idx, j+1));
                } else {
                    hash.put(alp, j+1);
                }
            }
        }
        
        for(int i=0; i<size; i++) {
            int cnt =0;
            for(int j=0; j<targets[i].length(); j++) {
                if(hash.containsKey(targets[i].charAt(j))){
                    cnt += hash.get(targets[i].charAt(j));
                } else {
                    cnt = -1;
                    break;
                }
            }
            answer[i] = cnt;
        }
        
        
        return answer;
    }
}