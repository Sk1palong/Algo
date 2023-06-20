class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String sumEven = "";
        String sumOdd = "";
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i]%2 == 0){
                sumEven += String.valueOf(num_list[i]);
            }
            else{
                sumOdd += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(sumEven)+Integer.parseInt(sumOdd);
        return answer;
    }
}