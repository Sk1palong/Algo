import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 99;

        int n = Integer.parseInt(br.readLine());

        if (n <= 99) {
            System.out.println(n);
            System.exit(0);
        } else if (n < 1000) {

            for (int i = 100; i <= n; i++) {
                int hundred = i / 100;
                int ten = (i % 100) / 10;
                int one = i % 10;

                if (hundred - ten == ten - one) {
                    cnt++;
                }
            }
        } else {
            System.out.println(144);
            System.exit(0);
        }

        System.out.println(cnt);
    }
}