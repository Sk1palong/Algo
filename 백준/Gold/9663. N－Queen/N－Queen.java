import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int[] chess;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        chess = new int[n];
        
        nQueen(0);
        
        System.out.println(cnt);
    }

    public static void nQueen(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            chess[depth] = i;
            if (check(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    private static boolean check(int col) {
        for (int i = 0; i < col; i++) {
            if (chess[col] == chess[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(chess[col] - chess[i])) {
                return false;
            }
        }

        return true;
    }
}