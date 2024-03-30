import java.util.*;

class Solution {
    static List<String> li;
    static String[] dic = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        int answer = 0;
        li = new ArrayList<>();
        char[] c = {'A','E','I','O','U'};
        String moeum = "AEIOU";
        
        dfs("", 0);
        for(int i=0; i<li.size(); i++) {
            if(word.equals(li.get(i))) {
                answer = i;
            }
        }
        // System.out.println(li);
        
        return answer;
    }
    public void dfs(String str, int len) {
        li.add(str);
        
        if(len == 5) {
            return;
        }
        
        for(int i=0; i<5; i++) {
            dfs(str + dic[i], len + 1);
        }
    }
}