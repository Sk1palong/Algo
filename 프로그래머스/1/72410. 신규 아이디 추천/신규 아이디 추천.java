class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1
        answer = new_id.toLowerCase();
        // 2
        for(int i=0; i<answer.length(); i++) {
            char c = answer.charAt(i);
            if(!('a' <= c && c <= 'z') && !('0' <= c && c <= '9')) {
                if(c != '-' && c != '_' && c != '.') {
                    answer = answer.replace(String.valueOf(c), "X");
                }
            }
        }
        answer = answer.replace("X", "");
        // 3
        while(answer.contains("..")) {
            answer = answer.replace("..", ".");
        }
        // 4
        if(answer.startsWith(".")) {
            answer = answer.substring(1, answer.length());
        }
        if(answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() -1);
        }
        // 5
        if(answer.isEmpty()) {
            answer = "a";
        }
        // 6
        if(15 < answer.length()) {
            answer = answer.substring(0, 15);
            if(answer.endsWith(".")) {
                answer = answer.substring(0, 14);
            }
        }
        // 7
        if(answer.length() <= 2) {
            while(answer.length() < 3) {
                answer += answer.charAt(answer.length() -1);
            }
        }
        
        return answer;
    }
}