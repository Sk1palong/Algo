import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        double M = Arrays.stream(arr).max().getAsDouble();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]/M*100;
        }
        double b = Arrays.stream(arr).average().getAsDouble();
        System.out.println(b);
    }
}