import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> hear = new HashSet<>();
        Set<String> see = new HashSet<>();
        int cnt = 0;
        List<String> li = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hear.add(br.readLine());
        }
        
        for (int i = 0; i < m; i++) {
            int size = hear.size();
            String name = br.readLine();
            hear.add(name);
            if (size == hear.size()) {
                li.add(name);
                cnt++;
            }
        }
        
        Collections.sort(li);
        
        sb.append(cnt).append('\n');
        for (String name : li) {
            sb.append(name).append('\n');
        }
        
        System.out.println(sb);
    }
}