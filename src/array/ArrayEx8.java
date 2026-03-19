package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] n = new int [9][9]; {
                for(int i = 0; i < 9; i++) {
                    for(int j = 0; j < 9; j++) {
                        n[i][j] = (i + 1) * (j + 1);
                    }
                }
        }

        System.out.println("구구단 배열 표");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        int num1, num2;
        System.out.println("첫 번째 숫자를 입력하세요.");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("두 번째 숫자를 입력하세요.");
        num2 = Integer.parseInt(br.readLine());

        System.out.println(n[num1 - 1][num2 - 1]);
    }
}
