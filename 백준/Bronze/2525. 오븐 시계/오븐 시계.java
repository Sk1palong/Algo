import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int m = A*60 +B +C;
        if (m >= 1440){
            m = m-1440;
        }
        System.out.println(m/60 + " " +m%60);
    }
}