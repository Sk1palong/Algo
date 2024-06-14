import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        boolean[] primeArr = new boolean[1_000_001];
        Arrays.fill(primeArr, true);
        primeArr[0] = primeArr[1] = false;

        for (int i = 2; i <= Math.sqrt(1_000_000); i++) {
            if (primeArr[i]) {
                for (int j = i * i; j <= 1_000_000; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int num = Integer.parseInt(br.readLine());

            for (int j = 2; j <= num / 2; j++) {
                if (primeArr[j] && primeArr[num - j]) {
                    cnt++;
                }
            }

            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }
}