import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Boolean> out = new HashMap<>();        
        Map<String, Integer> time = new HashMap<>();
        
        for(int i=0; i<records.length; i++) {
            String[] tmp = records[i].split(" ");
            int minute = Integer.parseInt(tmp[0].split(":")[0]) * 60 + Integer.parseInt(tmp[0].split(":")[1]);
            
            if(tmp[2].equals("IN")) {
                time.put(tmp[1], time.getOrDefault(tmp[1], 0) - minute);
                out.put(tmp[1], false);
            }
            
            if(tmp[2].equals("OUT")) {
                time.put(tmp[1], time.getOrDefault(tmp[1], 0) + minute);
                out.put(tmp[1], true);
            }
        }
        
        for(String key : out.keySet()) {
            if(!out.get(key)) {
                time.put(key, time.get(key) + 23 * 60 + 59);
            }
        }
        
        List<String> keyList = new ArrayList<>(time.keySet());
        int[] answer = new int[keyList.size()];
        Collections.sort(keyList);
        
        for(int i=0; i<keyList.size(); i++) {
            int feeTime = (int)Math.ceil((time.get(keyList.get(i)) - fees[0]) / (double)fees[2]);
            if(feeTime < 0) {
                feeTime = 0;
            }
            answer[i] = fees[1] + feeTime * fees[3];
        }        

        return answer;
    }
}