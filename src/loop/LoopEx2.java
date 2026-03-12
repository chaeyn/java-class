package loop;

import java.util.Scanner;

public class LoopEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println("for문");
        for (int i = number; i < number + 5 ; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        System.out.println("while문");
        int j = number;
        while (j < number + 5) {
            System.out.println(j);
            j++;
        }
    }
}
