import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();

        int day = (height - down) / (up - down);

        if((height - down) % (up - down) != 0) {
            day++;
        }

        System.out.println(day);

    }
}