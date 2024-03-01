class Solution{
    public int solution(int n, int a, int b) {
        int answer = 0;
//                1
//            1       2
//          1   2   3   4
//         1 2 3 4 5 6 7 8
        int idx = 0;
        while(a!=b){
            a = (a%2 == 1)? a/2 + 1 : a/2;
            b = (b%2 == 1)? b/2 + 1 : b/2;
            idx++;
        }
        answer = idx;
        
        return answer;
    }
}