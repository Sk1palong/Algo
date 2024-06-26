import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    static char[][] stars;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        stars = new char[n][n];
        for (char[] arr : stars) {
            Arrays.fill(arr, '*');
        }

        emptyCenter(0, 0, n, false);

        for (char[] arr : stars) {
            for (char c : arr) {
                bw.write(c);
            }
            bw.write('\n');
        }
        
        bw.flush();
        bw.close();
    }

    public static void emptyCenter(int nowR, int nowC, int n, boolean empty) {
        if (empty) {
            for (int i = nowR; i < nowR + n; i++) {
                for (int j = nowC; j < nowC + n; j++) {
                    stars[i][j] = ' ';
                }
            }
        }

        if (n == 1) {
            return;
        }

        int size = n / 3;
        int cnt = 0;

        for (int i = nowR; i < nowR + n; i += size) {
            for (int j = nowC; j < nowC + n; j += size) {
                cnt++;
                if (cnt == 5) {
                    emptyCenter(i, j, size, true);
                } else {
                    emptyCenter(i, j, size, false);
                }
            }
        }
    }
}