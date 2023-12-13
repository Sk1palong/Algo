class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int count = 0;
        for(int i = 0; i <a-1 ; i++){
            count += month[i];
        }
        count += b;
        answer = day[count%7];
        return answer;
    }
}