package class1;

import java.util.Date;

public class CarTest {
    public static void main(String[] args) {
        Date now = new Date();
        Car car = new Car("현대", "아반떼", now, "장강민", 3);
        car.displayCarInfo();
    }
}
