import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr, printArr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        printArr = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        Arrays.sort(arr);

        dfs(0, 0);
        
        System.out.println(sb);
    }

    static void dfs(int start, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(printArr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }
        
        int before = -1;
        for (int i = start; i < n; i++) {
            int now = arr[i];
            if (before != now) {
                before = now;
                printArr[depth] = arr[i];
                dfs(i, depth + 1);
            }
        } 
    }
}