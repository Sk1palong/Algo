import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Integer.parseInt(s,16);
        System.out.println(Integer.parseInt(String.valueOf(a),10));
        
    }
}