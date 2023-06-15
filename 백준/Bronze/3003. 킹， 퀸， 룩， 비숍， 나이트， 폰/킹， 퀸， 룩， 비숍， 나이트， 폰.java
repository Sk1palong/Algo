import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] chess = {1,1,2,2,2,8};
        int[] found = new int[st.countTokens()];
        int[] result = new int[st.countTokens()];
        for (int i = 0; i < 6; i++) {
            found[i] = Integer.parseInt(st.nextToken());
            result[i] = chess[i]-found[i];
            bw.write(String.valueOf(result[i])+" ");
        }
        bw.close();
    }
}