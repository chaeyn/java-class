package method;

public class MethodEx2 {
    public static void main(String[] args) {
        loop(3);
        System.out.println();
        loop(6);
        System.out.println();
        loop(9);
    }

    public static void loop(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World!");
        }
    }
}

