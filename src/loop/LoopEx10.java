package loop;

public class LoopEx10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.printf(num + " ");
                num++;
            }
            System.out.printf("\n");
        }
    }
}
