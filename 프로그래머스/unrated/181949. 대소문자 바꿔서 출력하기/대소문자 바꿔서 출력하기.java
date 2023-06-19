import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String a1 = a.toLowerCase();
        String a2 = a.toUpperCase();
        char[] c = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == a1.charAt(i)){
                 c[i] = a2.charAt(i);
            }
            else {
                 c[i] = a1.charAt(i);
            }
        }
        for (char cc : c) {
            System.out.print(cc);
        }
    }
}