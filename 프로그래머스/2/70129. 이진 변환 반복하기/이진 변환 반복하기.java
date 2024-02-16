class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            char[] c = s.toCharArray();
            s = "";
            for (char ch : c) {
                if (ch == '0') {
                    answer[1]++;
                } else {
                    s += ch;
                }
            }
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        return answer;
    }
}