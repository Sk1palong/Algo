import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        int num = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 6; i++) {
            int shirt = Integer.parseInt(st.nextToken());
            arr[i] = shirt;
        }

        st = new StringTokenizer(br.readLine(), " ");
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 6; i++) {
            num += arr[i] % t == 0 ? arr[i] / t : arr[i] / t + 1;
        }
        sb.append(num).append('\n');

        sb.append(n / p).append(' ').append(n % p);

        System.out.println(sb);
    }
}