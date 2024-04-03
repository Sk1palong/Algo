import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replace("{", "");
        s = s.replace("}", "");
        String[] arr = s.split(",");
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
            map.put(Integer.parseInt(arr[i]), map.getOrDefault(Integer.parseInt(arr[i]), 0) + 1);
        }
        int[] answer = new int[map.size()];
        // System.out.println(map);
        
        for(int key : map.keySet()) {
            answer[map.size() - map.get(key)] = key;
        }
        
        return answer;
    }
}