class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int j=0;
        int k=0;
        for (int i = 0; i < goal.length; i++) {
            if(goal[i].equals(cards1[j])){
                j = j < cards1.length -1 ? j+1 : j;
            }
            else if(goal[i].equals(cards2[k])){
                k = k < cards2.length -1 ? k+1 : k;
            }
            else{
                return "No";
            }
        }

        return answer;
    }
}