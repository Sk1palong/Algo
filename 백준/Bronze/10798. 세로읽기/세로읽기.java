import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }
        int max = arr[0].length();

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i].length()) {
                max = arr[i].length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i].length() < max) {
                while (arr[i].length() != max) {
                    arr[i] += " ";
                }
            }
        }
        for (int i = 0; i < arr[0].length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                char c = arr[j].charAt(i);

                if (c != ' ') {
                    answer += c;
                }
            }
        }

        System.out.println(answer);
    }
}