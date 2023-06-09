import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = N-1; j >= 0; j--) {
                if (i < j){
                    bw.write(" ");
                }
                else{
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}