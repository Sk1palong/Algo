import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        String code = br.readLine();
        long hash = 0;

        for (int i = 0; i < l; i++) {
            char c = code.charAt(i);
            hash += (long) ((c - 96) * Math.pow(31, i));
        }

        System.out.println(hash);
    }
}