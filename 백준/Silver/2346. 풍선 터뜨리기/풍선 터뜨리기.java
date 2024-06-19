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
        Deque<int[]> deq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            deq.offer(new int[]{i + 1, val});
        }

        while (deq.size() > 1) {
            sb.append(deq.peek()[0]).append(' ');
            int val = deq.poll()[1];

            if (val >= 0) {
                for (int i = 0; i < val - 1; i++) {
                    deq.offer(deq.poll());
                }
            } else {
                for (int i = 0; i < Math.abs(val); i++) {
                    deq.offerFirst(deq.pollLast());
                }
            }
        }
        sb.append(deq.poll()[0]);

        System.out.println(sb);
    }
}