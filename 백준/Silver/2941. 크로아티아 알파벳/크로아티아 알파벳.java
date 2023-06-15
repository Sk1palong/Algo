import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String s1 = s.replace("c=","c");
        String s2 = s1.replace("c-","c");
        String s3 = s2.replace("dz=","c");
        String s4 = s3.replace("s=","c");
        String s5 = s4.replace("d-","c");
        String s6 = s5.replace("z=","c");
        String s7 = s6.replace("nj","c");
        String s8 = s7.replace("lj","c");
        bw.write(String.valueOf(s8.length()));
        bw.close();
    }
}