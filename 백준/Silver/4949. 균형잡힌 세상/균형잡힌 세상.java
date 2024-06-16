import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String s = br.readLine();

            if (s.equals(".")) {
                break;
            }
            Stack<Character> stk = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char now = s.charAt(i);
                if (now == '(' || now == ')' || now == '[' || now ==']') {
                    if (stk.isEmpty()) {
                        stk.push(now);
                        if (now == ')' || now == ']') {
                            break;
                        }
                    } else if (stk.peek() == '(' && now == ')') {
                        stk.pop();
                    } else if (stk.peek() == '[' && now == ']') {
                        stk.pop();
                    } else {
                        stk.push(now);
                    }
                }
            }
            if (stk.isEmpty()) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            } 
        }


        System.out.println(sb);
    }

}