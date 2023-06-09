import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    int a;
    int b;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i + 1) + ": ");
            bw.write(a + " + " + b + " = " + (a + b) + "\n");

        }
        br.close();

        bw.flush();
        bw.close();
    }
}