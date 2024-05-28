import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> answer = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            List<Integer> common = new ArrayList<>();
            int sum = 0;
            String s = n + " = ";

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    common.add(i);
                }
            }

            for (int num : common) {
                if (s.equals(n + " = ")) {
                    s += num;
                } else {
                    s += " + " + num;
                }
                sum += num;
            }

            if (sum != n) {
                answer.add(n + " is NOT perfect.");
            } else {
                answer.add(s);
            }
        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}