import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] divisors = new int[n];

        for (int i = 0; i < n; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(divisors);

        System.out.println(divisors[0] * divisors[divisors.length - 1]);
    }
}