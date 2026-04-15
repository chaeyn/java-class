package static2.ex;

public class Car {
    String name;
    static int totalCars = 0;

    public Car(String name) {
        this.name = name;
        totalCars++;
        System.out.println("차량 구입, 이름: " + name);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
