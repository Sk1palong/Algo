import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] answer = new int[N][M];

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                answer[i][j] = arr1[i][j] + sc.nextInt();
            }
        }
        sc.close();
        for(int[] arr : answer) {
            for(int n : arr) {
                System.out.print(n+" ");
            }
            System.out.println("");
        }
    }
}