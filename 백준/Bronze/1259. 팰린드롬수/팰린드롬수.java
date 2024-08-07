import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            StringBuilder sb = new StringBuilder();
            sb.append(br.readLine());

            if (sb.toString().equals("0")) {
                break;
            }

            if (sb.toString().contentEquals(sb.reverse())) {
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}