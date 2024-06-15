import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stk = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            int call = Integer.parseInt(br.readLine());
            if (call != 0) {
                stk.push(call);
            } else {
                stk.pop();
            }
        }
        for (int money : stk) {
            total += money;
        }
        System.out.println(total);
    }

}