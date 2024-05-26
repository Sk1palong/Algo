import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int maxR = 0;
        int maxC = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            if(maxR < arr[i][1]) {
                maxR = arr[i][1];
            }
            if(maxC < arr[i][0]) {
                maxC = arr[i][0];
            }
        }
        int[][] matrix = new int[maxR+10][maxC+10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i][1]; j < arr[i][1]+ 10; j++) {
                for (int k = arr[i][0]; k < arr[i][0]+ 10; k++) {
                    matrix[j][k] = 1;
                }
            }
        }
        for (int[] array : matrix) {
            for (int a : array) {
                if(a == 1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}