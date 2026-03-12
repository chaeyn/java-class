package loop;

import java.util.Scanner;

public class LoopEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int printCnt1 = 0, printCnt2 = 0;

        System.out.println("for문");
        for (int i = number; printCnt1 < 5; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + " ");
                printCnt1++;
            }
        }

        System.out.println("\n");

        System.out.println("while문");
        int j = number;
        while (printCnt2 < 5) {
            if (j % 2 == 0) {
                System.out.printf(j + " ");
                printCnt2++;
            }
            j++;
        }
    }
}
