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

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int cardNum = Integer.parseInt(st.nextToken());
            count.put(cardNum, count.getOrDefault(cardNum, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            sb.append(count.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(' ');
        }

        System.out.println(sb);
    }
}