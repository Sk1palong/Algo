import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();
        boolean[] isQ = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (st.nextToken().equals("0")) {
                isQ[i] = true;
            }
        }

        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (isQ[i]) {
                deq.offer(val);
            }
        }


        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int val = Integer.parseInt(st.nextToken());
            deq.offerFirst(val);
            sb.append(deq.pollLast()).append(' ');
        }

        System.out.println(sb);
    }
}