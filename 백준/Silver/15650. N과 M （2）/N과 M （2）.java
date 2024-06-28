import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];
        arr = new int[m];
        dfs(0, 0);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

    public static void dfs(int start, int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(i + 1, depth + 1);

                visited[i] = false;
            }
        }
    }
}