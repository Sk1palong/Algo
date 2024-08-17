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

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();
            int cnt = 0;

            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                q.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean isMax = true;

                for (int j = 0; j < q.size(); j++) {
                    if (front[1] < q.get(j)[1]) {
                        q.offer(front);

                        for (int k = 0; k < j; k++) {
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (!isMax) {
                    continue;
                }

                cnt++;
                if (front[0] == m) {
                    break;
                }
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }
}