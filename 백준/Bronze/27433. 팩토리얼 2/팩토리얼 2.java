import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static long num = 1;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        fac(1, n);
        bw.write(num + "");
        bw.flush();
        bw.close();
    }

    public static void fac(int depth, long n) {
        if (depth == n + 1) {
            return;
        }
        num *= depth;
        fac(depth + 1, n);
    }
}