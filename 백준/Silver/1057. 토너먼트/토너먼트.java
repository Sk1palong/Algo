import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());
        int round = 0;


        while (lim != kim) {
            lim = lim % 2 == 0 ? lim / 2 : lim / 2 + 1;
            kim = kim % 2 == 0 ? kim / 2 : kim / 2 + 1;
            round++;
        }

        System.out.println(round);
    }
}