import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> answer = new ArrayList<>();

        while (true) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            if(first == 0 && second == 0) {
                break;
            }
            if(first % second == 0) {
                answer.add("multiple");
            } else if (second % first == 0) {
                answer.add("factor");
            } else {
                answer.add("neither");
            }
        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}