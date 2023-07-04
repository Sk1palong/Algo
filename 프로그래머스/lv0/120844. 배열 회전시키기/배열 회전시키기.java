class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int tmp = 0;
        if(direction.equals("right")){
            tmp = numbers[numbers.length-1];
            for(int i =numbers.length-1; i>0; i--){
                numbers[i] = numbers[i-1];
            }
            numbers[0] = tmp;
        }
        else{
            tmp = numbers[0]; 
            for(int i =0; i<numbers.length-1; i++){
                numbers[i] = numbers[i+1];
            }
                numbers[numbers.length-1] = tmp;
        }
        return numbers;
    }
}