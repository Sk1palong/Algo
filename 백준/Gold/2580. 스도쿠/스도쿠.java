import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int[][] matrix;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        matrix = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);

    }

    public static void sudoku(int row, int col) throws IOException {
        if (col == 9) {
            sudoku(row + 1, 0);
            return;
        }
        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(matrix[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }

        if (matrix[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (check(row, col, i)) {
                    matrix[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            matrix[row][col] = 0;
            return;
        }

        sudoku(row, col + 1);

    }

    public static boolean check(int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if (matrix[row][i] == val) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (matrix[i][col] == val) {
                return false;
            }
        }
        int set_row = row / 3 * 3;
        int set_col = col / 3 * 3;

        for (int i = set_row; i <set_row + 3; i++) {
            for (int j = set_col; j <set_col + 3; j++) {
                if (matrix[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}