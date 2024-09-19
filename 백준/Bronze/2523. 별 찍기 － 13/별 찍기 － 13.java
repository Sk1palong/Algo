import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean reach = false;
        int idx = 1;

        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < idx; j++) {
                bw.write("*");
            }

            bw.write("\n");

            if (i == n - 1) {
                reach = true;
            }

            if (reach) {
                idx--;
            } else {
                idx++;
            }

        }

        bw.flush();
        bw.close();
    }
}