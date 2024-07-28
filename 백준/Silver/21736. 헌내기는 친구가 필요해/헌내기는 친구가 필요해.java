import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static char[][] map;
    static boolean[][] visited;
    static int nowR, nowC;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int cnt = 0;

    public static class Node {
        int r, c;

        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'I') {
                    nowR = i;
                    nowC = j;
                }
            }
        }

        bfs(nowR, nowC);

        if (cnt == 0) {
            System.out.println("TT");
        } else {
            System.out.println(cnt);
        }
    }

    static void bfs(int r, int c) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(r, c));
        visited[r][c] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();
            r = cur.r;
            c = cur.c;

            for (int i = 0; i < 4; i++) {
                nowR = r + dr[i];
                nowC = c + dc[i];
                if (bc(nowR, nowC, n, m) && !visited[nowR][nowC] && map[nowR][nowC] != 'X') {
                    if (map[nowR][nowC] == 'P') {
                        cnt++;
                    }

                    visited[nowR][nowC] = true;
                    q.offer(new Node(nowR, nowC));
                }
            }

        }
    }

    static boolean bc(int r, int c, int n, int m) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }
}