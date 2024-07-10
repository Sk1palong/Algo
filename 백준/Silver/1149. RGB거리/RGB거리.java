import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;
    static int[][] cost;
    static int[][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        cost = new int[n][3];
        dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            cost[i][RED] = Integer.parseInt(st.nextToken());
            cost[i][GREEN] = Integer.parseInt(st.nextToken());
            cost[i][BLUE] = Integer.parseInt(st.nextToken());
        }

        dp[0][RED] = cost[0][RED];
        dp[0][GREEN] = cost[0][GREEN];
        dp[0][BLUE] = cost[0][BLUE];

        System.out.println(Math.min(Paint_cost(n - 1, RED),
            Math.min(Paint_cost(n - 1, GREEN), Paint_cost(n - 1, BLUE))));
    }

    static int Paint_cost(int n, int color) {
        if (dp[n][color] == 0) {
            if (color == RED) {
                dp[n][color] =
                    Math.min(Paint_cost(n - 1, GREEN), Paint_cost(n - 1, BLUE)) + cost[n][RED];
            }
            if (color == GREEN) {
                dp[n][color] =
                    Math.min(Paint_cost(n - 1, RED), Paint_cost(n - 1, BLUE)) + cost[n][GREEN];
            }
            if (color == BLUE) {
                dp[n][color] =
                    Math.min(Paint_cost(n-1, RED), Paint_cost(n-1, GREEN)) + cost[n][BLUE];
            }
        }

        return dp[n][color];
    }
}