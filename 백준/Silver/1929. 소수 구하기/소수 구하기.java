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

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] primeArr = new boolean[m + 1];
        Arrays.fill(primeArr, true);
        primeArr[0] = primeArr[1] = false;

        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (primeArr[i]) {
                for (int j = i * i; j <= m; j += i) {
                    primeArr[j] = false;
                }
            }
        }
        for (int i = n; i <= m; i++) {
            if (primeArr[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}