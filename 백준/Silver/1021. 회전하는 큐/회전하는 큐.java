import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> deq = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            deq.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int target = deq.indexOf(arr[i]);
            int half;

            if (deq.size() % 2 == 0) {
                half = deq.size() / 2 - 1;
            } else {
                half = deq.size() / 2;
            }

            if (target <= half) {
                for (int j = 0; j < target; j++) {
                    deq.offerLast(deq.pollFirst());
                    cnt++;
                }
            } else {
                for (int j = 0; j < deq.size() - target; j++) {
                    deq.offerFirst(deq.pollLast());
                    cnt++;
                }
            }

            deq.pollFirst();
        }

        System.out.println(cnt);
    }
}