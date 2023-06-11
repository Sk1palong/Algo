import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i >0 ; i++) {


            int n0 = sc.nextInt();
            if (n0 == 0)
                break;
            int n1 = n0 * 3;
            if (n1 % 2 == 0) {
                int n2 = n1 / 2;
                int n3 = n2 * 3;
                int n4 = n3 / 9;
                System.out.println(i+". even "+n4);
            } else {
                int n2 = (n1 + 1) /2;
                int n3 = n2 * 3;
                int n4 = n3 / 9;

                System.out.println(i+". odd "+n4);
            }
        }
    }
}