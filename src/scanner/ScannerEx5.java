package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
            if (n == 0) {
                System.out.println(sum);
                return;
            }
        }
    }
}
