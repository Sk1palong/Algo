import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] cnt = new int[10];

        long multi = (long)a * b * c;
        String result = Long.toString(multi);

        for (int i = 0; i < result.length(); i++) {
            cnt[result.charAt(i) - '0']++;
        }
        for (int n : cnt) {
            bw.write(n + "\n");
        }

        bw.flush();
        bw.close();
    }
}