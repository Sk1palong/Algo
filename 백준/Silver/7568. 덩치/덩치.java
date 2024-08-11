import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][2];
       

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            matrix[i][0] = x;
            matrix[i][1] = y;
        }

        for (int i = 0; i < n; i++) {
            int weight = matrix[i][0];
            int height = matrix[i][1];
            int rank = 1;
            
            for (int j = 0; j < n; j++) {
                    int compareW = matrix[j][0];
                    int compareH = matrix[j][1];
                    
                    if (weight < compareW && height < compareH) {
                        rank++;
                    }
            }

            sb.append(rank).append(' ');
        }

        System.out.println(sb);
    }
}