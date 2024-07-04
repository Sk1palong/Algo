import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int cntR = 0;
    static int cntD = 0;
    static int[] fib;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        fib = new int[n + 1];

        recur(n);
        dp(n);

        System.out.println(cntR + " " + cntD);
    }

    static int recur(int n) {
        if (n == 1 || n == 2) {
            cntR++;
            return 1;
        } else {
            return recur(n - 1) + recur(n - 2);
        }
    }

    static int dp(int n) {
        fib[1] = fib[2] = 1;
        for (int i = 3; i <= n; i++) {
            cntD++;
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}