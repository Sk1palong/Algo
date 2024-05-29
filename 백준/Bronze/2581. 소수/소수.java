import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<Integer> primeList = new ArrayList<>();
        int sum = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(10000, i)) {
                primeList.add(i);
            }
        }
        if (primeList.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < primeList.size(); i++) {
                sum += primeList.get(i);
            }
            System.out.println(sum);
            System.out.println(primeList.get(0));
        }
    }

    public static boolean isPrime(int cnt, int num) {
        boolean[] prime = new boolean[cnt + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i < Math.sqrt(cnt); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= cnt; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime[num];
    }
}