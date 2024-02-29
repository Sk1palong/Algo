class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int days = b-1;
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=0; i<a-1; i++) {
            days += month[i];
        }
        
        answer += day[days%7];
        System.out.println(days);
        return answer;
    }
}