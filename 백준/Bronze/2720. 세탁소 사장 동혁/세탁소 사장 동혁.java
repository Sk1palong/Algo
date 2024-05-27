import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int change = sc.nextInt();
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;

            while(change >= 25) {
                change -= 25;
                quarter++;
            }
            while(change >= 10) {
                change -= 10;
                dime++;
            }
            while(change >= 5) {
                change -= 5;
                nickel++;
            }
            while(change >= 1) {
                change -= 1;
                penny++;
            }
            answer[i] = quarter + " " + dime + " " + nickel + " " + penny;
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}