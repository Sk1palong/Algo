import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, min, max;
    static int[] numbers, operators;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        operators = new int[4];
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(numbers[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int num, int idx) {
        if (idx == n) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                switch (i) {
                    case 0: dfs(num + numbers[idx], idx + 1); break;
                    case 1: dfs(num - numbers[idx], idx + 1); break;
                    case 2: dfs(num * numbers[idx], idx + 1); break;
                    case 3: dfs(num / numbers[idx], idx + 1); break;
                }

                operators[i]++;
            }
        }

    }
}