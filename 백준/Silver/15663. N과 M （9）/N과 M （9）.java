import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr, printArr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        printArr = new int[m];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(printArr[i]).append(" ");
            }

            sb.append('\n');
            return;
        }
        
        int before = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && before != arr[i]) {
                visited[i] = true;
                printArr[depth] = arr[i];
                before = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}