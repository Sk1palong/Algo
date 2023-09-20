import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int leng = score.length;
        Arrays.sort(score);
        if (leng % m == 0) {
            for (int i = 0; i < leng; i += m) {
                answer = answer + score[i] * m;
            }
        } else {
            for (int i = leng-1; i-m+1 >= 0; i -= m) {
                answer = answer + score[i-m+1] * m;
            }

        }

        return answer;
    }
}