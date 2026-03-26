package method;

public class MethodEx {
    public static void main(String[] args) {
        System.out.println("평균값: " + avg(1, 2, 3));
        System.out.println("평균값: " + avg(3, 4, 5));
    }

    public static double avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
