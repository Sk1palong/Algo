import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            if (n == 0) {
                break;
            }

            boolean[] primeArr = new boolean[n * 2 + 1];
            Arrays.fill(primeArr, true);
            primeArr[0] = primeArr[1] = false;

            for (int i = 2; i <= Math.sqrt(n * 2); i++) {
                if (primeArr[i]) {
                    for (int j = i * i; j <= n * 2; j += i) {
                        primeArr[j] = false;
                    }
                }
            }

            for (int i = n + 1; i <= n * 2; i++) {
                if (primeArr[i]) {
                    cnt++;
                }
            }

            sb.append(cnt).append('\n');
        }
        
        System.out.println(sb);
    }
}