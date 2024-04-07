import java.util.*;

class Solution {
    private static List<int[]> li = new ArrayList<>();
    
    public List<int[]> solution(int n) {
        dfs(n, 1, 2, 3);
        
        return li;
    }
    
    public void dfs(int cnt, int from , int mid, int to) {
        if(cnt == 0) {
            return;
        }
        dfs(cnt - 1, from, to, mid);
        li.add(new int[]{from, to});
        dfs(cnt - 1, mid, from, to);
    }
}