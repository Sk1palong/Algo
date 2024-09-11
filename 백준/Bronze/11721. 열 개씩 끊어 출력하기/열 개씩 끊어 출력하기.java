import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        while (true) {
            if (line.length() <= 10) {
                bw.write(line);
                break;
            }

            bw.write(line.substring(0, 10) + "\n");
            line = line.substring(10);
        }

        bw.flush();
        bw.close();
    }
}