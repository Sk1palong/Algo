import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int zero, one, zero_plus_one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(zero).append(' ').append(one).append('\n');
        }

        System.out.println(sb);
    }

    static void fibonacci(int n) {
        zero = 1;
        one = 0;
        zero_plus_one = 1;

        for (int i = 0; i < n; i++) {
            zero = one;
            one = zero_plus_one;
            zero_plus_one = zero + one;
        }
    }
}