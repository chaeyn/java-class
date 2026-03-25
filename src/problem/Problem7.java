package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 9; i++) {
            if (a >= b) {
                for (int j = a; j >= b; j--) {
                    System.out.print(j + " * " + i + " = " + j * i + "   ");
                }
                System.out.println();
            } else {
                for (int j = a; j <= b; j++) {
                    System.out.print(j + " * " + i + " = " + j * i + "   ");
                }
                System.out.println();
            }
        }
    }
}
