import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x>=y){
                System.out.println("MMM BRAINS");
            }
            else {
                System.out.println("NO BRAINS");
            }
        }
    }
}