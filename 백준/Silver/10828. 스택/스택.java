import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();
            switch (cmd) {
                case "push":
                    stk.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (!stk.isEmpty()) {
                        sb.append(stk.pop()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                case "size":
                    sb.append(stk.size()).append('\n');
                    break;
                case "empty":
                    if (stk.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "top":
                    if (!stk.isEmpty()) {
                        sb.append(stk.peek()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
            }
        }

        System.out.println(sb);
    }
}