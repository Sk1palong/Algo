class Solution {
    private static boolean[] visited;
    private static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
        
        return answer;
    }
    
    public void dfs(int fatigue, int[][] dungeons, int depth) {
        for(int i=0; i<dungeons.length; i++) {
            if(visited[i] || fatigue < dungeons[i][0]) {
                continue;
            }
            visited[i] = true;
            dfs(fatigue - dungeons[i][1], dungeons, depth + 1);
            visited[i] = false;
        }
            answer = Math.max(answer, depth);
    }
}