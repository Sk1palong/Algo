import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int[] arrX = new int[n];
        int[] arrY = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrX[i] = x;
            arrY[i] = y;
        }
        Arrays.sort(arrX);
        Arrays.sort(arrY);

        int maxX = arrX[arrX.length - 1];
        int minX = arrX[0];
        int maxY = arrY[arrY.length - 1];
        int minY = arrY[0];

        System.out.println((maxX - minX) * (maxY - minY));

    }
}