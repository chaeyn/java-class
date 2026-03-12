package loop;

public class LoopEx1 {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0;
        int i = 1, j = 1;

        System.out.println("while문");
        while (i <= 3) {
            sum1 += i;
            System.out.println("i=" + i + " sum=" + sum1);
            i++;
        }

        System.out.println("\n");

        System.out.println("for문");
        for (j = 1; j <= 3; j++) {
            sum2 += j;
            System.out.println("j=" + j + " sum=" + sum2);
        }
    }
}
