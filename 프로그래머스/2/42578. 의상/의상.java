import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, List<String>> map = new HashMap<>();
        
        for(String[] arr : clothes) {
            map.putIfAbsent(arr[1], new ArrayList<>());
            map.get(arr[1]).add(arr[0]);
        }
        
        for(List<String> li : map.values()) {
            answer *= li.size() + 1;
        }
        
        answer--;

        return answer;
    }
}