package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String result = n % 2 == 0 ? "짝수" : "홀수";

        System.out.println("입력한 숫자 " + result + "는 " + result + "입니다.");
    }
}
