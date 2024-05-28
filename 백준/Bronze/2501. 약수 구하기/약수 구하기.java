import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> common = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                common.add(i);
            }
        }
        if (k > common.size()) {
            System.out.println(0);
        }
        else {
            System.out.println(common.get(k - 1));
        }
    }
}