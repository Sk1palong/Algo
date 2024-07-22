import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String operation = st.nextToken();
            int val;
            switch (operation) {
                case "add":
                    val = Integer.parseInt(st.nextToken());
                    set.add(val);
                    break;
                case "remove":
                    val = Integer.parseInt(st.nextToken());
                    set.remove(val);
                    break;
                case "check":
                    val = Integer.parseInt(st.nextToken());
                    if (set.contains(val)) {
                        sb.append('1').append('\n');
                    } else {
                        sb.append('0').append('\n');
                    }
                    break;
                case "toggle":
                    val = Integer.parseInt(st.nextToken());
                    if (set.contains(val)) {
                        set.remove(val);
                    } else {
                        set.add(val);
                    }
                    break;
                case "all":
                    set = new HashSet<>();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();

            }
        }
        System.out.println(sb);
    }
}