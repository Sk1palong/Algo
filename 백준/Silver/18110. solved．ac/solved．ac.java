import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] ratings = new int[n];
        int difficulty = 0;
        int round = (int) Math.round(n * 0.15d);

        for (int i = 0; i < n; i++) {
            int rating = Integer.parseInt(br.readLine());
            ratings[i] = rating;
        }

        Arrays.sort(ratings);

        for (int i = round; i < n - round; i++) {
            difficulty += ratings[i];
        }

        System.out.println((int)Math.round((float) difficulty / (n - 2 * round)));
    }
}