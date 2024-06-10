import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
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

        Set<Integer> a = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> b = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }
        int total = a.size() + b.size();
        int cnt = 0;
        for (int num : b) {
            if (a.contains(num)) {
                cnt+=2;
            }
        }

        System.out.println(total - cnt);

    }
}