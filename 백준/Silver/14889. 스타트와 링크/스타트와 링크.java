import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] matrix;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        team(0, 0);
        System.out.println(min);

    }

    public static void team(int cnt, int idx) {
        if (cnt == n / 2) {
            diff();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                team(cnt + 1, i + 1);

                visited[i] = false;
            }
        }
    }

    public static void diff() {
        int teamA = 0;
        int teamB = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!visited[i] && !visited[j]) {
                    teamA += matrix[i][j];
                    teamA += matrix[j][i];
                }
                else if (visited[i] && visited[j]) {
                    teamB += matrix[i][j];
                    teamB += matrix[j][i];
                }
            }
        }

        int val = Math.abs(teamA - teamB);

        if (val == 0) {
            System.out.println(0);
            System.exit(0);
        }

        min = Math.min(val, min);

    }
}