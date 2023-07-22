import java.util.*;

class Solution {
    public int solution(int a, int b) {
        b /= gcd(a,b);
        while(b != 1){
            if(b % 2 == 0){
                b/=2;
            }
            else if(b % 5 ==0){
                b/=5;
            }
            else{
                return 2;
            }
        }
        return 1;
    }

    public static int gcd(int x, int y) {
        if(x%y == 0) {
            return y;
        }
        return gcd(y, x%y);
    }
}