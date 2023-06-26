class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1000];
        int max = -1;
        for(int i = 0 ; i < array.length; i++){
            arr[array[i]]++;
        }
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                answer = i;
            }else if(arr[i] ==max){
                answer = -1;
            }
        }
        return answer;
    }
}