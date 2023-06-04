import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        int i1 = Integer.parseInt(s.substring(2));
        int i2 = Integer.parseInt(s.substring(1,2));
        int i3 = Integer.parseInt(s.substring(0,1));
        int is = Integer.parseInt(s);

        System.out.println(i*i1);
        System.out.println(i*i2);
        System.out.println(i*i3);
        System.out.println(i*is);
        
    }
}