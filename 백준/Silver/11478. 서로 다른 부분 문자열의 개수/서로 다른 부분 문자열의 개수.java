import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        int leng = s.length();
        Set<String> set = new HashSet<>();
        int size = 1;
        
        while (size <= leng) {
            for (int start = 0; start <= leng - size; start++) {
                if (leng >= start + size) {
                    set.add(s.substring(start, start + size));
                }
            }
            size++;
        }
        
        System.out.println(set.size());
    }
}