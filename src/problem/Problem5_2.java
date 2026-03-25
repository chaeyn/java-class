package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        int sum = 0, cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                sum += i;
                cnt += 1;
            }
        }

        double avg = (double) sum / cnt;
        System.out.println("sum: " + sum);
        System.out.printf("avg: %.1f", avg);
    }
}
