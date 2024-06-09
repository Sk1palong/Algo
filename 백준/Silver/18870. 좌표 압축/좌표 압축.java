import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine(), " ");
        int[] origin = new int[n];
        int[] sorted = new int[n];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            origin[i] = x;
            sorted[i] = x;
        }
        Arrays.sort(sorted);
        int rank = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], rank);
                rank++;
            }
        }
        for (int i = 0; i < n; i++) {
            sb.append(map.get(origin[i])).append(" ");
        }
        System.out.println(sb);
    }
}