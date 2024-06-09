import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Map<String, Boolean> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String check = st.nextToken();
            if (check.equals("enter")) {
                map.put(name, true);
            } else {
                map.put(name, false);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key)) {
                ans.add(key);
            }
        }
        Collections.sort(ans, Collections.reverseOrder());
        for (String name : ans) {
            sb.append(name).append('\n');
        }
        System.out.println(sb);
    }
}