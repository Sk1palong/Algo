import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        // Queue<Character> q = new LinkedList<>();
        // for(int i=0; i<skill.length(); i++) {
        //     q.add(skill.charAt(i));
        // }
       loop : for(int i=0; i<skill_trees.length; i++) {
            Queue<Character> q = new LinkedList<>();
            for(int j=0; j<skill.length(); j++) {
                q.add(skill.charAt(j));
            }
            for(int j=0; j<skill_trees[i].length(); j++) {
                char c = skill_trees[i].charAt(j);
                if(q.contains(c)) {
                    if(q.peek() != c) {
                        continue loop;
                    }
                    else {
                        q.poll();
                    }
                }
            }
           answer++;
        }
        // System.out.println(q);
        return answer;
    }
}