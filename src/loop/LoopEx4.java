package loop;

import java.util.Scanner;

public class LoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum1 = 0, sum2 = 0;

        System.out.println("for문");
        for (int i = 1; i <= number; i++) {
            sum1 += i;
            System.out.printf(sum1 + " ");
        }



        System.out.println("\n");
        System.out.println("while문");
        int i = 1;
        while(i <= number) {
            sum2 += i;
            System.out.printf(sum2 + " ");
            i++;
        }
    }
}
