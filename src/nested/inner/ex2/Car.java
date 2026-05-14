package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

   public void start() {
        engine.start();
       System.out.println(model);
   }

   private class Engine {
        private Car car;
        public Engine(Car car) {
            this.car = car;
        }
        public void start() {
            System.out.println("충전 레벨 확인: " + car.getClass());
            System.out.println(car.getModel() + "의 엔진을 구동합니다.");
        }
    }

}
