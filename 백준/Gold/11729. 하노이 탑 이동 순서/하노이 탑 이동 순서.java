import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        dfs(n, 1, 2, 3);
        bw.write(cnt + "\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void dfs(int n, int from, int mid, int to) {
        if (n == 0) {
            return;
        }
        
        cnt++;
        
        dfs(n - 1, from, to, mid);
        sb.append(from).append(' ').append(to).append('\n');
        dfs(n - 1, mid, from, to);
    }

}