import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    deq.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deq.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (deq.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deq.pollFirst() + "\n");
                    }
                    break;
                case "pop_back":
                    if (deq.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deq.pollLast() + "\n");
                    }
                    break;
                case "size":
                    bw.write(deq.size() + "\n");
                    break;
                case "empty":
                    bw.write(deq.isEmpty() ? "1" + "\n" : "0" + "\n");
                    break;
                case "front":
                    if (deq.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deq.peekFirst() + "\n");
                    }
                    break;
                case "back":
                    if (deq.isEmpty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deq.peekLast() + "\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}