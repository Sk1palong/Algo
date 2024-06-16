import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            q.offer(Integer.valueOf(st.nextToken()));
        }
        int idx = 1;

        while (idx < n + 1) {
            int now = idx;
            while (!q.isEmpty() && q.peek() != idx) {
                stk.push(q.poll());
            }
            while (!q.isEmpty() && q.peek() == idx) {
                q.poll();
                idx++;
            }
            while (!stk.isEmpty() && stk.peek() == idx) {
                stk.pop();
                idx++;
            }
            if (idx == now) {
                idx++;
            }
        }
        if (q.isEmpty() && stk.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }

}