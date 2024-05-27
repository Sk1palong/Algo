import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int idx = 0;
        int locationR = 0;
        int locationC = 1;
        for (int i = 2; i < n; ) {
            if (idx % 2 == 0) {
                while (locationC != 0 && i < n) {
                    locationR++;
                    locationC--;
                    i++;
                }
                if (locationC == 0 && i < n) {
                    locationR++;
                    i++;
                }
            } else {
                while (locationR != 0 && i < n) {
                    locationR--;
                    locationC++;
                    i++;
                }
                if (locationR == 0 && i < n) {
                    locationC++;
                    i++;
                }
            }
            idx++;
        }
        if (n == 1) {
            System.out.println(1 + "/" + 1);
        } else {
            System.out.println((locationR + 1) + "/" + (locationC + 1));
        }

    }
}