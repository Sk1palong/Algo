import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
//        자료구조에 words값이 중복되지 않고 word의 다음 문자열이 word의 끝 문자로 시작한다면 words값을 추가
//        그렇지 않으면 해당 (index+1)%3, (index/3)+1 값을 answer에 추가
        Set<String> set = new HashSet<>();
        
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if(!set.contains(words[i]) && words[i].charAt(0) == words[i-1].charAt(words[i-1].length()-1)){
                set.add(words[i]);
            } 
            else {
                answer[0] = ((i+1) % n == 0) ? n : (i+1) % n;
                answer[1] = i / n+1;
                break;
            }
        }

        return answer;
    }
}