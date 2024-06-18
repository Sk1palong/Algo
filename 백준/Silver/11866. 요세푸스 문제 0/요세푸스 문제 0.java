import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> li = new LinkedList<>();
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            li.add(i);
        }

        sb.append('<');
        while (!li.isEmpty()) {
            idx = (idx + (k - 1)) % li.size();
            sb.append(li.get(idx)).append(", ");
            li.remove(idx);
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append('>');
        
        System.out.println(sb);
    }
}