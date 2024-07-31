import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int n = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        sb.append(n).append('\n');

        int s = Integer.parseInt(a + b) - Integer.parseInt(c);
        sb.append(s);
        
        System.out.println(sb);
    }
}