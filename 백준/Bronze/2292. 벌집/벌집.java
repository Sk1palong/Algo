import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int idx = 1;
        List<Integer> li = new ArrayList<>();
        li.add(1);
        
        while (true) {
            if(n == 1) {
                System.out.println(1);
                break;
            }
            int limit = li.get(idx-1) + 6 * idx;
            if(limit >= n) {
                System.out.println(idx+1);
                break;
            }
            else {
                li.add(limit);
                idx++;
            }
        }
    }
}