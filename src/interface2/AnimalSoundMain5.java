package interface2;

public class AnimalSoundMain5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Pig pig = new Pig();
        Chicken chicken = new Chicken();
        Duck duck = new Duck();

        AbstractAnimal[] animalArr = {dog, cat, caw, pig, chicken, duck};

        for (AbstractAnimal animal : animalArr) {
            animal.introduce();
            soundAnimal(animal);
            moveAnimal(animal);
            swimAnimal(animal);
            flyAnimal(animal);
            System.out.println();
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

    private static void flyAnimal(AbstractAnimal animal) {
        if (animal instanceof Fly flyAnimal) {
            System.out.println("비행 가능 테스트 시작");
            flyAnimal.fly();
            System.out.println("비행 가능 테스트 종료");
        }
    }

    private static void swimAnimal(AbstractAnimal animal) {
        if (animal instanceof Swim swimAnimal) {
            System.out.println("수영 가능 테스트 시작");
            swimAnimal.swim();
            System.out.println("수영 가능 테스트 종료");
        }
    }
}
