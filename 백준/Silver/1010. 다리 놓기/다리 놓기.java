import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            dp = new int[b + 1][a + 1];
            
            sb.append(BC(b, a)).append('\n');
        }
        
        System.out.println(sb);
    }

    public static int BC(int n, int k) {
        if (dp[n][k] > 0) {
            return dp[n][k];
        }
        if (n == k || k == 0) {
            return dp[n][k] = 1;
        }
        return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
    }
}