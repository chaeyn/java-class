package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("입력할 수의 개수를 입력해주세요: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int min = 99999, max = -99999;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (min >= num) min = num;
            if (max < num) max = num;
            arr[i] = num;
        }

        System.out.println("최대: " + max);
        System.out.println("최소: " + min);
    }
}
