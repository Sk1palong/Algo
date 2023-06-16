import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] score = new int[n];

            for (int j = 0; j <n; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }

            double cnt = 0;
            for (int j = 0; j < n; j++) {
                double avr = Arrays.stream(score).average().getAsDouble();
                if (score[j] > avr){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt*100/n));
        }
    }
}