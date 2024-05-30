import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> answer = new ArrayList<>();

     loop : while (true) {
            Set<Integer> lineSet = new HashSet<>();
            int[] lines = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 3; i++) {
                int line = Integer.parseInt(st.nextToken());
                if (line == 0) {
                    break loop;
                }
                lineSet.add(line);
                lines[i] = line;
            }

            Arrays.sort(lines);

            if (lines[2] >= lines[0] + lines[1]) {
                answer.add("Invalid");
            } else if (lineSet.size() == 1) {
                answer.add("Equilateral");
            } else if (lineSet.size() == 2) {
                answer.add("Isosceles");
            } else {
                answer.add("Scalene");
            }
        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}