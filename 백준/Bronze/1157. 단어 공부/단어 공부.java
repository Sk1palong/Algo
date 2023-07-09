import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'A']++;
        }
        int max = arr[0];
        int idx =0;
        for (int i = 0; i < 26; i++) {
            if(arr[i]>max){
                max = arr[i];
                idx = i;
            }
        }
        Arrays.sort(arr);
        if(arr[24] == arr[25]){
            System.out.println("?");
        }
        else System.out.println((char)(idx+'A'));

    }
}