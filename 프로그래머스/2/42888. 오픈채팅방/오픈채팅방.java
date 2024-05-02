import java.util.*;

class Solution {
    public List<String> solution(String[] record) {
        List<String> answer = new ArrayList<>();
        Map<String, String> name = new HashMap<>();
        
        for(int i=0; i<record.length; i++) {
            String[] split = record[i].split(" ");
            if(split.length > 2) {
                name.put(split[1], split[2]);
            }
        }
        for(int i=0; i<record.length; i++) {
            String tmp = "";
            String[] split = record[i].split(" ");
            if(!split[0].equals("Change")) {
                tmp += name.get(split[1]);
            }
            if(split[0].equals("Enter")) {
                tmp += "님이 들어왔습니다.";
            }
            if(split[0].equals("Leave")){
                tmp += "님이 나갔습니다.";
            }
            if(!tmp.equals("")) {
                answer.add(tmp);
            }
            // System.out.println(tmp);
        }
        
        // System.out.println(name);
        return answer;
    }
}