package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println(arr[i]);
                return;
            }
            System.out.print(arr[i] + ", ");
        }
    }
}
