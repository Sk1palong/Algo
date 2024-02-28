class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int temp = 0;
        for(int i=0; i<k-1; i++) {
            temp += 2;
        }
        System.out.println(temp%numbers.length);
        answer = numbers[temp%numbers.length];
        return answer;
    }
}