import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> li = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            li.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(li);
        for (int num : li) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}