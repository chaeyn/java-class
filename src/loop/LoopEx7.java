package loop;

import java.util.Scanner;

public class LoopEx7 {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }
}
