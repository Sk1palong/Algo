import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for (int j= x-1;  j<y ; j++) {
                arr[j]=z;
            }
        }
        for (int k = 0; k < N; k++) {
            System.out.print(arr[k]+ " ");
        }
    }
}