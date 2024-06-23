import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> frequency = new HashMap<>();
        List<String> sorted;

        for (int i = 0; i < n; i++) {
            String words = br.readLine();
            if (words.length() >= m) {
                frequency.put(words, frequency.getOrDefault(words, 0) + 1);
            }
        }
        sorted = new ArrayList<>(frequency.keySet());

        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = 0;
                result = frequency.get(o2) - frequency.get(o1);
                if (result == 0) {
                    result = o2.length() - o1.length();
                }
                if (result == 0) {
                    result = o1.compareTo(o2);
                }
                return result;
            }
        });

        for (String word : sorted) {
            sb.append(word).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}