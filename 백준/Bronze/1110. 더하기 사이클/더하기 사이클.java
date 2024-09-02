import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String init = s;
        int cycle = 0;

        while (true) {
            if (s.length() == 1) {
                s = "0" + s;
            }

            int tmp = 0;
            for (int i = 0; i < 2; i++) {
                tmp += Integer.parseInt(s.charAt(i) + "");
            }

            String tmpStr = tmp + "";
            char a = s.charAt(s.length() - 1);
            char b = tmpStr.charAt(tmpStr.length() - 1);

            s = a == '0' ? b + "" : a + "" + b;
            cycle++;

            if (s.equals(init)) {
                bw.write(cycle + "");
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}