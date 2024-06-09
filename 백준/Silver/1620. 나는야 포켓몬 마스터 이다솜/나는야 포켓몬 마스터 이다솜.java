import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Map<String, String> name = new HashMap<>();
        Map<String, String> number = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String tmp = br.readLine();
            name.put(tmp, String.valueOf(i));
            number.put(String.valueOf(i), tmp);
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if ('0' <= s.charAt(0) && s.charAt(0) <= '9') {
                sb.append(number.get(s)).append('\n');
            } else {
                sb.append(name.get(s)).append('\n');
            }
        }

        System.out.println(sb);

    }
}