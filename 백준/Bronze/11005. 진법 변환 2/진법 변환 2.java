import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int radix = sc.nextInt();

        System.out.println(Integer.toString(n, radix).toUpperCase());
    }
}