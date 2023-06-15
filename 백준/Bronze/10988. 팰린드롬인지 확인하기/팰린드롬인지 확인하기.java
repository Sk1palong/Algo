import javax.imageio.IIOException;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] arr = s.split("");
        String tmp;
        String s2="";
        int j =s.length();
        int i = 0;
        while(i < j){
            tmp = arr[i];
            arr[i] = arr[j-1];
            arr[j-1] = tmp;
            i++; j--;
        }
        for (int k = 0; k < s.length(); k++) {
            s2 = s2.concat(arr[k]);
        }
        if (s.equals(s2)){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        bw.close();
      }
}