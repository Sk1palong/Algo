import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int num = 0;
            String line = br.readLine();
            
            if (!line.equals("Fizz") && !line.equals("Buzz") && !line.equals("FizzBuzz")) {
                num = Integer.parseInt(line);
            }
            
            if (num != 0) {
                int ans = num + 3 - i;
                if (ans % 3 == 0 && ans % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (ans % 3 == 0) {
                    System.out.println("Fizz");
                } else if (ans % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(ans);
                }
                break;
            }
        }
    }
}