import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (char c = 97;  c<123 ; c++) {
            System.out.print(s.indexOf(c)+" ");
        }
    }
}