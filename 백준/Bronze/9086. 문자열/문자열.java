import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String first="";
        String last="";

        for (int i = 0; i < a; i++) {
            String s = sc.next();
            first = String.valueOf(s.charAt(0));
            last = String.valueOf(s.charAt(s.length()-1));
            System.out.println(first+last);
        }

    }
}