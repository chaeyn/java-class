package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("점수를 입력하세요.");
            int score = Integer.parseInt(br.readLine());

            if (score >= 80) {
                System.out.println("축하합니다. 합격입니다.");
            } else if (score < 80) {
                System.out.println("죄송합니다. 불합격입니다.");
            } else return;
        }
    }
}
