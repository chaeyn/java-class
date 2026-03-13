package loop;

public class LoopEx11 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf(i + " ");
            }
            System.out.printf("\n");
        }
    }
}
