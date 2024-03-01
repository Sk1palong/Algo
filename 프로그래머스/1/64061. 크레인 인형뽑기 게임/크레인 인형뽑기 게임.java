import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        
        for(int n : moves) {
            n--;
            loop : for(int[] arr : board) {
                if(arr[n] != 0) {
                    if(!stk.isEmpty() && stk.peek() ==arr[n]) {
                        stk.pop();
                        answer += 2;
                        arr[n] =0;
                        break loop;
                    } else {
                        stk.push(arr[n]);
                        arr[n] =0;
                        break loop;
                    }
                }
            }
        }
        for(int[] arr : board) {
            for(int n : arr) {
                System.out.print(n);
            }
        }
        return answer;
    }
}