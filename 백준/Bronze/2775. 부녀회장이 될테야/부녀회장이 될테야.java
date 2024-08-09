import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        
        int sum = 1;
        int[][] dp = new int[15][14];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 14; j++) {
                if (i == 0) {
                    dp[i][j] = sum++;
                } else {
                    for (int k = 0; k <= j; k++) {
                        dp[i][j] += dp[i - 1][k];
                    }
                }
            }
        }

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[k][n - 1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}