import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int score = Math.max(40, Integer.parseInt(br.readLine()));
            sum += score;
        }

        System.out.println(sum / 5);
    }
}