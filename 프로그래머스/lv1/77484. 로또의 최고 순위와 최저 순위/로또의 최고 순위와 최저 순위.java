class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int unid = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                }
            }
            if (lottos[i] == 0) {
                unid++;
            }
        }
        if (cnt == 0 && unid < 2) {
            answer[0] = 6;
        } else {
            answer[0] = 7 - (cnt + unid);
        }
        if (cnt >= 1) {
            answer[1] = 7 - cnt;
        } else {
            answer[1] = 6;
        }
        System.out.println("cnt : " + cnt);
        System.out.println("unid : " + unid);
        return answer;
    }
}