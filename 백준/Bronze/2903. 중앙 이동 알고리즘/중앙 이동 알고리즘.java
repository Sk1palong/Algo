import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int proto = 2;
        int[] arr = new int[n+1];
        arr[0] = proto;

        for (int i = 1; i < n+1; i++) {
            arr[i] = arr[i-1] + (int)Math.pow(2,i-1);
        }

        System.out.println((int)Math.pow(arr[n],2));
    }
}