import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr = new int[8];
        boolean asc = true;
        boolean desc = true;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 8; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        for (int i = 1; i < 8; i++) {
            if (arr[i-1] > arr[i]) {
                asc = false;
            }
            if (arr[i - 1] < arr[i]) {
                desc = false;
            }
        }
        if (asc) {
            System.out.println("ascending");
        } else if (desc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}