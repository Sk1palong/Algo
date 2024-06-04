import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue pq = new PriorityQueue();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            pq.offer(num);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pq.poll());
        }
    }
}