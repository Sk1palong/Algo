import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        
        for(String s : id_list) {
            map.put(s, new HashSet<>());
        }
        
        for(String s : report) {
            String[] sArr = s.split(" ");
            String reporter = sArr[0];
            String reportee = sArr[1];
            
            map.get(reporter).add(reportee);
        }
        
        for(String s : id_list) {
            for(String str : map.get(s)) {
                count.put(str, count.getOrDefault(str, 0) +1);
            }
        }
        
        for(int i=0; i<id_list.length; i++) {
            for(String s : map.get(id_list[i])) {
                if(count.get(s) >= k) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}