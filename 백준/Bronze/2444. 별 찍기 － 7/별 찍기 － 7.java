import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (n - 2 * i < j - i && j - i < n) {
                    bw.write("*");
                } else if (j-i <= n-2*i){
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (0 < j - i && j - i < 2*(n-i)) {
                    bw.write("*");
                } else if (j-i <= 0 ){
                    bw.write(" ");
                }
            }
            if(i != (n-1)){
                bw.write("\n");
            }
        }
        bw.close();
    }
}