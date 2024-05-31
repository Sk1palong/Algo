import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < 1000000; i++) {
            int tmp = i;
            int tmp2 = i;
            while (tmp2 > 0) {
                tmp += tmp2 % 10;
                tmp2 /= 10;
            }
            map.put(tmp, Math.min(map.getOrDefault(tmp, i), i));

        }
        if (map.get(n) != null) {
            System.out.println(map.get(n));
        } else {
            System.out.println(0);
        }
    }
}