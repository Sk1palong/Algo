import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[] arr = new int[N];
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
            if (arr[i]>max){
                max = arr[i];
                index = (i+1);
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}