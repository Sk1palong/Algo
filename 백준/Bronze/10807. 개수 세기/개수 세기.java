import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int count = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        sc.close();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == b){
                count++;
            }
        }
        System.out.println(count);
    }
}