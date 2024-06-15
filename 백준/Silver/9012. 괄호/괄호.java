import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

       loop : for (int i = 0; i < n; i++) {
            String s = br.readLine();
            Stack<Character> stk = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                char now = s.charAt(j);
                if (stk.isEmpty()) {
                    stk.push(now);
                } else if (stk.peek() == '(' && now == ')') {
                    stk.pop();
                } else {
                    stk.push(now);
                }
            }
            if (stk.isEmpty()) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }

}