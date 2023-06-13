import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();

        String[] arr = n1.split("");
        String s = arr[2]+arr[1]+arr[0];
        int x = Integer.parseInt(s);

        String[] arr2 = n2.split("");
        String s2 = arr2[2]+arr2[1]+arr2[0];
        int y = Integer.parseInt(s2);

        if (x>y){
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }

    }
}