class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = numer1*denom2;
        int b = numer2*denom1;
        int c = denom1*denom2;
        int d = a+b;
        for(int i = d-1; i>1; i--){
            if(d%i==0 && c%i==0){
                d/=i;
                c/=i;
            }
        }
        answer[0] = d;
        answer[1] = c;
        return answer;
    }
}