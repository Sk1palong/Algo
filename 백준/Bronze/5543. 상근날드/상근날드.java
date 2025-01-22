import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int burgerPrice = 2000;
        for (int i = 0; i < 3; i++) {
            burgerPrice = Math.min(burgerPrice, Integer.parseInt(br.readLine()));
        }

        int beveragePrice = 2000;
        for (int i = 0; i < 2; i++) {
            beveragePrice = Math.min(beveragePrice, Integer.parseInt(br.readLine()));
        }

        System.out.println(burgerPrice + beveragePrice - 50);
    }
}