import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        int total = 0;
        int avg = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
            total += num;
        }
        
        Arrays.sort(numbers);

        avg = (int)Math.round((double)total / n);
        int count = 0;
        int max = -1;
        int mod = numbers[0];
        boolean check = false;
        
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count++;
            } else {
                count = 0;
            }

            if (max < count) {
                max = count;
                mod = numbers[i];
                check = true;
            } else if (max == count && check) {
                mod = numbers[i];
                check = false;
            }
        }
        
        sb.append(avg).append('\n');
        sb.append(numbers[n / 2]).append('\n');
        sb.append(mod).append('\n');
        sb.append(numbers[n - 1] - numbers[0]);

        System.out.println(sb);
    }
}