import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();

            switch (cmd) {
                case "push": deq.offer(Integer.parseInt(st.nextToken())); break;
                case "pop":
                    if (!deq.isEmpty()) {
                        bw.write(deq.poll() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "size": bw.write(deq.size() + "\n"); break;
                case "empty":
                    if (!deq.isEmpty()) {
                        bw.write(0 + "\n");
                    } else {
                        bw.write(1 + "\n");
                    }
                    break;
                case "front":
                    if (!deq.isEmpty()) {
                        bw.write(deq.peekFirst() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "back":
                    if (!deq.isEmpty()) {
                        bw.write(deq.peekLast() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}