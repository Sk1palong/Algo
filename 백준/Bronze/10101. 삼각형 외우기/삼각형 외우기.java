import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int angle1 = Integer.parseInt(br.readLine());
        int angle2 = Integer.parseInt(br.readLine());
        int angle3 = Integer.parseInt(br.readLine());
        Set<Integer> angleSet = new HashSet<>();
        angleSet.add(angle1);
        angleSet.add(angle2);
        angleSet.add(angle3);

        if (angle1 + angle2 + angle3 != 180) {
            System.out.println("Error");
        } else if (angleSet.size() == 1) {
            System.out.println("Equilateral");
        } else if (angleSet.size() == 2) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

    }
}