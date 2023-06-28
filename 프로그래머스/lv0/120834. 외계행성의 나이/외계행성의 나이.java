class Solution {
    public String solution(int age) {
        String answer = "";
        char[] c = String.valueOf(age).toCharArray();
        int[] arr = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            arr[i] = c[i]+49;
        }
        for (int i = 0; i < c.length; i++) {
            answer += (char)arr[i];
        }
        return answer;
    }
}