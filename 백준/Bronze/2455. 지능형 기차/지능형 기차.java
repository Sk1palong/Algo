import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int record = 0;
        int[] records = new int[4];

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());

            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            int gap = in - out;

            record += gap;

            records[i] = record;
        }

        Arrays.sort(records);

        System.out.println(records[3]);
    }
}