import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = gcd(a, b);
        int lcm = a * b / gcd;

        bw.write(gcd + "\n");
        bw.write(lcm + "\n");

        bw.flush();
        bw.close();
    }

    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}