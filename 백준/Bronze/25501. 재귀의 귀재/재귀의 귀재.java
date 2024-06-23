import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0;
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            bw.write(isPalindrome(br.readLine()) + " " + cnt + '\n');
        }
        
        bw.flush();
        bw.close();
    }

    public static int isPalindrome(String s) {
        cnt = 0;
        return recursion(s, 0, s.length() - 1);
    }

    public static int recursion(String s, int l, int r) {
        cnt++;
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }
}