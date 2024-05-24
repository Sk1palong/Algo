import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            if(check(br.readLine())) {
                answer++;
            }
        }

        br.close();
        System.out.println(answer);

    }

    public static boolean check(String s) {
        int prev = 0;
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);

            if(now != prev) {
                if(arr[now - (int)'a'] == 0) {
                    arr[now - (int)'a']++;
                    prev = now;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}