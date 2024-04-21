import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> li1 = new ArrayList<>();
        List<String> li2 = new ArrayList<>();
        List<String> inter = new ArrayList<>();
        List<String> union = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        for(int i=0; i<str1.length()-1; i++) {
            String tmp = str1.substring(i, i+2);
            if(!('a' <= tmp.charAt(0) && tmp.charAt(0) <= 'z')) {
                continue;
            }
            if(!('a' <= tmp.charAt(1) && tmp.charAt(1) <= 'z')) {
                continue;
            }
            li1.add(tmp);
        }
        for(int i=0; i<str2.length()-1; i++) {
            String tmp = str2.substring(i, i+2);
            if(!('a' <= tmp.charAt(0) && tmp.charAt(0) <= 'z')) {
                continue;
            }
            if(!('a' <= tmp.charAt(1) && tmp.charAt(1) <= 'z')) {
                continue;
            }
            li2.add(tmp);
            temp.add(tmp);
        }
        
        for(int i=0; i<li1.size(); i++) {
            for(int j=0; j<temp.size(); j++) {
                if(li1.get(i).equals(temp.get(j))) {
                    inter.add(li1.get(i));
                    temp.remove(j);
                    break;
                }
            }
        }
        
        for(String s : li1) {
            union.add(s);
        }
        
        for(String s : li2) {
            union.add(s);
        }
        
        if(union.size() - inter.size() == 0) {
            return 65536;
        } else {
            answer = 65536 * inter.size() / (union.size()-inter.size());
        }
        
        return answer;
    }
}