class Solution {
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i=0; i<computers.length; i++) {
            if(!visited[i]) {
                dfs(computers, i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int[][] computers, int now) {
        visited[now] = true;
        
        for(int i=0; i<computers.length; i++) {
            if(now != i && computers[now][i] == 1 && visited[i] == false) {
                dfs(computers, i);
            }
        }
    }
}