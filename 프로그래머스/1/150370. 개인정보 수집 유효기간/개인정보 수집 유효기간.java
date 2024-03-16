import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> li = new ArrayList<>();
        int idx=1;
        Map<String, Integer> map = new HashMap<>();
        
        for(String term : terms) {
            String[] temp = term.split(" ");
            map.put(temp[0], Integer.parseInt(temp[1]));
        }
        
        for(String privacy : privacies) {
            int year = Integer.parseInt(privacy.substring(0,4));
            int month = Integer.parseInt(privacy.substring(5,7));
            int day = Integer.parseInt(privacy.substring(8,10));
            int term = map.get(privacy.substring(11)) * 28;
            
            day += term;
            while(day > 28) {
                day -= 28;
                month++;
            }
            
            while(month > 12) {
                month -= 12;
                year++;
            }
            
            String strM = "" + month;
            String strD = "" + day;
            if(month < 10) {
                strM = "0" + month;
            }
            if(day < 10) {
                strD = "0" + day;
            }
            // System.out.println(year);
            // System.out.println(strM);
            // System.out.println(strD);
            String expire = year + strM + strD;
            // System.out.println(expire);
            String strT = today.replace(".", "");
            // System.out.println(strT);
            // System.out.println("today : " + Integer.parseInt(strT));
            // System.out.println("exprie : " + Integer.parseInt(expire));
            // System.out.println(strT);
            if(Integer.parseInt(strT) >= Integer.parseInt(expire)) {
                li.add(idx);
            }
            idx++;
        }
        
        int[] answer = new int[li.size()];
        
        for(int i=0; i<li.size(); i++) {
            answer[i] = li.get(i);
        }
        
        return answer;
    }
}