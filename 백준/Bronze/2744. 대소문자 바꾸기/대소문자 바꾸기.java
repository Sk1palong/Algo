import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if ('A' <= c && c <= 'Z') {
                c += 'a' - 'A';
            } else {
                c -= 'a' - 'A';
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}