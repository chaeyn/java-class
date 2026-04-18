package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
//        data1 = 20;
        System.out.println("final data1: "+data1);
        final int data2 = 20;
        System.out.println("final data2: "+data2);
    }

    static void method(final int parameter) {
        System.out.println("final 매개변수: " + parameter);
//        parameter = 20;
    }
}
