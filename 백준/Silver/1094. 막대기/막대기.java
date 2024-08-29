import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int stick = 64;
        int cnt = 0;

        while (x > 0) {
            if (x < stick) {
                stick /= 2;
            } else {
                x -= stick;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}