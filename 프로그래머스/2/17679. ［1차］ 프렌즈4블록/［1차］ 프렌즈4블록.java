import java.util.*;

class Solution {
    static class Node {
        int r, c;
        char val;
        
        public Node(int r, int c, char val) {
            this.r = r;
            this.c = c;
            this.val = val;
        }
    }
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        int[] dr = {0, 1, 1};
        int[] dc = {1, 1, 0};
        Queue<Node> q = new LinkedList<>();
        
        char[][] matrix = new char[m][n];
        char[][] copy = new char[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                char c = board[i].charAt(j);
                matrix[i][j] = c;
                copy[i][j] = c;
            }
        }
        boolean[][] visited = new boolean[m][n];
        while(true) {
            int nowA = answer;
            visited = new boolean[m][n];
            visited[0][0] = true;
            q.offer(new Node(0, 0, matrix[0][0]));
            
            while(!q.isEmpty()) {
                Node cur = q.poll();
                int nowR = cur.r;
                int nowC = cur.c;
                char val = cur.val;
                if(nowR == m - 1 || nowC == n - 1) {
                    continue;
                }

                boolean same = true;

                for(int i=0; i<3; i++) {
                    int r = nowR + dr[i];
                    int c = nowC + dc[i];

                    if(bc(m, n, r, c)) {
                        if(!visited[r][c]) {
                            visited[r][c] = true;
                            q.offer(new Node(r, c, matrix[r][c]));
                        }
                        if(val != matrix[r][c]) {
                            same = false;
                        }
                    }
                }

                if(same) {
                    if(copy[nowR][nowC] != '0') {
                        copy[nowR][nowC] = '0';
                        answer++;
                    }
                    for(int i=0; i<3; i++) {
                        int r = nowR + dr[i];
                        int c = nowC + dc[i];
                        if(bc(m, n, r, c) && copy[r][c] != '0') {
                            copy[r][c] = '0';
                            answer++;
                        }
                    }
                }
            }
            
            for(int j=0; j<n; j++) {
                for(int i=m-1; i>=0; i--) {
                    if(copy[i][j] == '0') {
                        for(int k=i-1; k>=0; k--) {
                            if(copy[k][j] != '0') {
                                copy[i][j] = copy[k][j];
                                copy[k][j] = '0';
                                break;
                            }
                        }
                    }
                }
            }
            for(int r = 0; r < m; r++) {
                for(int c = 0; c < n; c++) {
                    matrix[r][c] = copy[r][c];
                }
            }   

            if(nowA == answer) {
                break;
            }
        }
        
        return answer;
    }
    
    public boolean bc(int m, int n, int r, int c) {
        return 0 <= r && r < m && 0 <= c && c < n; 
    }
}