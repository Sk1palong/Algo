import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = (i + 1);
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a;
            a = arr[x - 1];
            arr[x - 1] = arr[y - 1];
            arr[y - 1] = a;
        }
        for (int j = 0; j < N; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}