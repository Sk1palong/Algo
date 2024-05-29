import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int prime = sc.nextInt();
            if (isPrime(1000, prime)) {
                answer++;
            }
        }

        System.out.println(answer);

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