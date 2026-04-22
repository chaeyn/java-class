package interface2;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void move() {
        System.out.println("닭 이동");
    }

    @Override
    public void fly() {
        System.out.println("잠깐 날 수는 있지만 멀리 날지는 못합니다.");
    }

    @Override
    public void introduce() {
        System.out.println("저는 닭입니다. 눈은 " + DEFAULT_EYE_COUNNT + "개를 가지고 있습니다.");
        System.out.println("맛있습니다.");
    }
}
