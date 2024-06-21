import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet<>();
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        
        br.readLine();
        for (int i = 0; i < n-1; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                cnt += set.size();
                set = new HashSet<>();
            } else if (i == n - 2) {
                set.add(s);
                cnt += set.size();
            } else {
                set.add(s);
            }
        }

        System.out.println(cnt);
    }
}