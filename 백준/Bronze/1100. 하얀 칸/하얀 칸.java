import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean odd = true;
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String line = br.readLine();
            if (odd) {
                for (int j = 0; j < 8; j += 2) {
                    if (line.charAt(j) == 'F') {
                        cnt++;
                    }
                }
            } else {
                for (int j = 1; j < 8; j += 2) {
                    if (line.charAt(j) == 'F') {
                        cnt++;
                    }
                }
            }

            odd = !odd;
        }

        System.out.println(cnt);
    }
}