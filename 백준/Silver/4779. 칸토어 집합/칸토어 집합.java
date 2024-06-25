import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            sb = new StringBuilder();

            int leng = (int) Math.pow(3, n);

            arr = new char[leng];
            Arrays.fill(arr, '-');
            divide(0, leng);
            for (char c : arr) {
                sb.append(c);
            }
            System.out.println(sb);
        }
        br.close();
    }

    static void divide(int start, int leng) {
        if (leng <= 1) {
            return;
        }

        int newLeng = leng / 3;

        for (int i = start + newLeng; i <start + newLeng * 2 ; i++) {
            arr[i] = ' ';
        }

        divide(start, newLeng);
        divide(start + newLeng * 2, newLeng);
    }
}