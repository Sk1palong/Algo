import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] lines = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            lines[i] = Integer.parseInt(st.nextToken());
            sum += lines[i];
        }
        Arrays.sort(lines);

        if (triangle(lines[0], lines[1], lines[2])) {
            System.out.println(sum);
        } else {
            while (!triangle(lines[0], lines[1], lines[2])) {
                lines[2]--;
                sum--;
            }
            System.out.println(sum);
        }
    }

    public static boolean triangle(int a, int b, int c) {
        return c < a + b;
    }
}