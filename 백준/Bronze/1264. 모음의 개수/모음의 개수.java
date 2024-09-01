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
            int cnt = 0;
            String line = br.readLine();
            line = line.toLowerCase();

            if (line.equals("#")) {
                break;
            }
            
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    cnt++;
                }
            }

            bw.write(cnt + "\n");

        }

        bw.flush();
        bw.close();
    }
}