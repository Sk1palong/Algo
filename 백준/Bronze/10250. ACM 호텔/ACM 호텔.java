import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int back = n % h == 0 ? n / h : n / h + 1;
            int front = n % h == 0 ? h : n % h;

            String b = back >= 10 ? back+"" : "0"+back;

            sb.append(front).append(b).append("\n");
        }

        System.out.println(sb);
    }
}