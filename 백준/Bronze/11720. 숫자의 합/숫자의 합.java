import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
           arr[i] = Integer.parseInt(s.substring(i,i+1));
        }
        System.out.println(Arrays.stream(arr).sum());
    }
}