import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[42];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            arr[a%42] = true;
        }
        for (boolean value: arr) {
            if(value){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}