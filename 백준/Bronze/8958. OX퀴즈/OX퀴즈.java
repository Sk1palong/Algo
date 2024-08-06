import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int sum = 0;

            String str = br.readLine();
            str = str.replace("XX", "X");
            String[] arr = str.split("X");
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length(); k++) {
                    int score = k + 1;
                    sum += score;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}