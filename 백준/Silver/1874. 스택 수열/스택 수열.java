import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stk = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int start = 0;

        for (int i = 0; i < n; i++) {

            int val = Integer.parseInt(br.readLine());

            if (start < val) {
                for (int j = start + 1; j <= val; j++) {
                    stk.push(j);
                    sb.append('+').append('\n');
                }

                start = val;

            } else if (stk.peek() != val) {
                System.out.println("NO");
                System.exit(0);
            }

            stk.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}